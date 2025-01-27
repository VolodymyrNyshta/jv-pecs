package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    List<? extends Machine> machineProducer;
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Excavator.class)) {
            machineProducer = new ExcavatorProducer().get();
        } else if (type.equals(Truck.class)) {
            machineProducer = new TruckProducer().get();
        } else if (type.equals(Bulldozer.class)) {
            machineProducer = new BulldozerProducer().get();
        } else {
            machineProducer = new ArrayList<>();
        }
        return new ArrayList<>(machineProducer);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

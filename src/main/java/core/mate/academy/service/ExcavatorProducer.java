package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        Excavator excavator2 = new Excavator();
        Excavator excavator3 = new Excavator();
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
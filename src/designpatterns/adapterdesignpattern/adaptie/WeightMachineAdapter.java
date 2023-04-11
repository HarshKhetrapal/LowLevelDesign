package designpatterns.adapterdesignpattern.adaptie;

import designpatterns.adapterdesignpattern.adapter.BabyWeightMachine;
import designpatterns.adapterdesignpattern.adapter.IWeightMachine;

public class WeightMachineAdapter implements IWeightMachineAdapter{
    IWeightMachine weightMachine;

    public WeightMachineAdapter() {
        this.weightMachine = new BabyWeightMachine();
    }

    @Override
    public double getWeightInKg() {
        int weightInPonds = this.weightMachine.getWeightInPonds();
        return weightInPonds * .45;
    }
}

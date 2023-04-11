package designpatterns.adapterdesignpattern.client;

import designpatterns.adapterdesignpattern.adaptie.IWeightMachineAdapter;
import designpatterns.adapterdesignpattern.adaptie.WeightMachineAdapter;

public class ApplicationMain {
    public static void main(String[] args) {
        IWeightMachineAdapter weightMachine = new WeightMachineAdapter();
        System.out.println("Weight in KG is: " + weightMachine.getWeightInKg() + "kg");
    }
}

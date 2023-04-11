package designpatterns.adapterdesignpattern.adapter;

public class BabyWeightMachine implements IWeightMachine {
    @Override
    public int getWeightInPonds() {
        return 50;
    }
}

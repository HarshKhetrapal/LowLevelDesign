package designpatterns.compositedesignpattern.calculator;

public class Number implements IOperation {
    int num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public int execute() {
        return this.num;
    }
}

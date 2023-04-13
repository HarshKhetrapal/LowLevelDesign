package designpatterns.compositedesignpattern.calculator;

public class AirthmaticOperation implements IOperation {

    IOperation leftNumber;
    IOperation rightNumber;
    Operator oprator;

    public AirthmaticOperation(IOperation leftNumber, IOperation rightNumber, Operator oprator) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
        this.oprator = oprator;
    }

    @Override
    public int execute() {
        switch (this.oprator) {
            case Addition:
                return leftNumber.execute() + rightNumber.execute();
            case Multiplication:
                return leftNumber.execute() * rightNumber.execute();
            default:
                System.out.println("Operation not supported");
                return 0;
        }
    }
}

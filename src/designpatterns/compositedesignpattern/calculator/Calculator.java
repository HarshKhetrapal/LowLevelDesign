package designpatterns.compositedesignpattern.calculator;

public class Calculator {
    public static void main(String[] args) {
        Number number1 = new Number(1);
        Number number2 = new Number(1);
        Number number3 = new Number(2);
        AirthmaticOperation arth1 = new AirthmaticOperation(number1, number2,Operator.Addition);
        AirthmaticOperation arth2 = new AirthmaticOperation(number3, arth1,Operator.Multiplication);
        System.out.println("Final result is: " + arth2.execute());
    }

}

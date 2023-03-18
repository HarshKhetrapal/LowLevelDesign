package designpatterns.factorydesignpattern;

public class ShapeFactory {
    public Shape getShape(String input) {
        switch (input) {
            case "CIRCLE" :
                return new Circle();
            case "RECTANGLE" :
                return new Rectangle();
            case "TRIANGLE" :
                return new Triangle();
            default: return null;
        }
    }
}

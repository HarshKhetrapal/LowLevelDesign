package designpatterns.factorydesignpattern;

public class ApplicationMain {
    public static void main(String args[]) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Shape triangle = shapeFactory.getShape("TRIANGLE");
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}

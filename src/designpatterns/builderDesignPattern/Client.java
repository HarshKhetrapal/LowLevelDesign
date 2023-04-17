package designpatterns.builderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Director engdirector = new Director(new EngineerStudentBuilder());
        Student engStudent = engdirector.createStudent();
        System.out.println("Engineering " + engStudent.toString());

        Director mbadirector = new Director(new MBAStudentBuilder());
        Student mbaStudent = mbadirector.createStudent();
        System.out.println("MBA  " + mbaStudent.toString());
    }
}

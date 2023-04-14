package designpatterns.builderDesignPattern;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }
     public Student createStudent() {
        if(this.studentBuilder instanceof EngineerStudentBuilder)
            return createEngineeringStudent();
        else if(this.studentBuilder instanceof MBAStudentBuilder)
            return createMBAStudent();
        else
            return null;
     }

    private Student createMBAStudent() {
        return this.studentBuilder.setName("Harsh").setRollNo(456).setFatherName("ABC").setMotherName("XYZ").setSubjects().build();
    }

    private Student createEngineeringStudent() {
        return this.studentBuilder.setName("Devesh Verma").setRollNo(123).setSubjects().build();
    }
}

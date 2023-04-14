package designpatterns.builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        this.subjects = new ArrayList<>();
        subjects.add("OS");
        subjects.add("CN");
        subjects.add("DS");
        subjects.add("ALGO");
        return this;
    }
}

package designpatterns.builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        this.subjects = new ArrayList<>();
        subjects.add("BBA");
        subjects.add("MBA Basics");
        subjects.add("MBA ADV");
        subjects.add("MBA PRO");
        return this;
    }
}

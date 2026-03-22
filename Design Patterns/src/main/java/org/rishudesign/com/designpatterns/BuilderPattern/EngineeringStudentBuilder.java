package org.rishudesign.com.designpatterns.BuilderPattern;
import java.util.*;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> enggSubjectsList = new ArrayList<>();
        enggSubjectsList.add("Operating Systems");
        enggSubjectsList.add("Computer Architecture");
        enggSubjectsList.add("Data Structures");
        enggSubjectsList.add("DBMS");
        this.subjects = enggSubjectsList;
        return this;
    }

}

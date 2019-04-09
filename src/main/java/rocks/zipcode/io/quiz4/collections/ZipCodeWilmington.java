package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private List<Student> students;

    public ZipCodeWilmington(List<Student> students) {
        this.students = students;
    }

    public ZipCodeWilmington() {
        students =  new ArrayList<>();
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return students.contains(student);
    }

    public void lecture(double numberOfHours) {
        students.forEach(student -> student.learn(numberOfHours));
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student,Double> studyMap= new LinkedHashMap<>();
        students.forEach(student -> studyMap.put(student,student.getTotalStudyTime()));
        return studyMap;
    }
}

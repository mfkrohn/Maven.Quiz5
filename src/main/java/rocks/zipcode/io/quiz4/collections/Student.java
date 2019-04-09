package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student implements Comparable<Student>{
    private Double totalAmountOfHoursLearned;
    private Integer id;
    public Student() {
        this(1);

    }

    public Student(Integer id) {
        this.id = id;
        this.totalAmountOfHoursLearned = 0.0;
    }

    public void learn(Double amountOfHours) {
        totalAmountOfHoursLearned += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return totalAmountOfHoursLearned;
    }


    @Override
    public int compareTo(Student o) {
        return (int)(o.totalAmountOfHoursLearned - this.totalAmountOfHoursLearned);
    }
}

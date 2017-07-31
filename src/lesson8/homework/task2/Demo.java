package lesson8.homework.task2;

/**
 * Created by Admin on 27.05.2017.
 */
import java.util.Date;

public class Demo {
    public Course highMath = new Course(new Date(), "High Math", 200, "Jake Dow", this.students);
    public Course[] courses = {this.highMath};
    public Student student1 = new Student("John", "Smith", 1, this.courses);
    public Student[] students = {this.student1};
    public SpecialStudent specialStudent = new SpecialStudent("Mike", "Brain", 2, this.courses, 424, "mikebrain@mailinator.com");

    public Student createHighestParent(){
        return this.student1;
    }
    public SpecialStudent createLowestChild(){
        return this.specialStudent;
    }
}

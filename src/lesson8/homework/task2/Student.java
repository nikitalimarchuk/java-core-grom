package lesson8.homework.task2;

/**
 * Created by Admin on 27.05.2017.
 */
public class Student {
    public String firstName;
    public String lastName;
    public int group;
    public Course[] coursesTaken;
    public int age;

    public Student(String firstName, String lastName, int group, Course[] coursesTaken) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.coursesTaken = coursesTaken;
    }
}

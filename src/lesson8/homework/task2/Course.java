package lesson8.homework.task2;

import java.util.Date;

/**
 * Created by Admin on 27.05.2017.
 */
public class Course {
    public Date startDate;
    public String name;
    public int horseDuration;
    public String teacherName;
    public Student[] students;

    public Course(Date startDate, String name, int horseDuration, String teacherName, Student[] students) {
        this.startDate = startDate;
        this.name = name;
        this.horseDuration = horseDuration;
        this.teacherName = teacherName;
        this.students = students;
    }
}

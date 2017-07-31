package lesson8.homework.task2;

/**
 * Created by Admin on 27.05.2017.
 */
public class CollegeStudent extends Student{
    public String collegeName;
    public int rating;
    public long id;

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken) {
        super(firstName, lastName, group, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, Course[] courseTaken, String collegeName, int rating, long id) {
        super(firstName, lastName, group, courseTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}

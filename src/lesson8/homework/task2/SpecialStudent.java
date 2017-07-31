package lesson8.homework.task2;

/**
 * Created by Admin on 27.05.2017.
 */
public class SpecialStudent extends CollegeStudent{
    public long secretKey;
    public String email;

    public SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken, long secretKey, String email) {
        super(firstName, lastName, group, coursesTaken);
        this.secretKey = secretKey;
        this.email = email;
    }
}

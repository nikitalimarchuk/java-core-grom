package lesson8.ads;

import java.util.Date;

/**
 * Created by Admin on 27.05.2017.
 */
public class Message extends BaseEntity{
    public User userFrom;
    public User userTo;
    public Date dateSent;
    public Date dateRead;
    public String message;

    public Message(long id, User userFrom, User userTo, Date dateSent, String message) {
        super(id);
        this.userFrom = userFrom;
        this.userTo = userTo;
        this.dateSent = new Date();
        this.message = message;
    }

    public void setDateRead(){
        dateRead = new Date();
    }

    public boolean isRead(){
        return dateRead == null;
    }
}

package lesson9.homework;

public class UserRepository {
    private int length = 10;
    private User[] users = new User[this.length];
    private static int counter = 0;

    public User save(User user) {
        if (counter == length) {
            return null;
        }
        else {
            if (findById(user.getId()) != null) {
                return null;
            }
            else {
                users[findNullCells()] = user;
                counter++;
                return user;
            }
        }
    }

    public User update(User user) {
        if (user != null) {
            if (findById(user.getId()) != null) {
                for (int i = 0; i < length; i++) {
                    if (users[i] != null) {
                        if (users[i].getId() == user.getId()) {
                            users[i] = user;
                            break;
                        }
                    }
                }
                return user;
            }
            return null;
        }
        else
            return null;
    }

    public void delete(long id) {
        User user = findById(id);
        for (int i = 0; i < length; i++) {
            if (users[i].equals(user)) {
                users[i] = null;
                counter--;
            }
        }
    }

    private User findById(long id) {
        for (User user : users) {
            if (user != null) {
                if (user.getId() == id) {
                    return user;
                }
            }
        }
        return null;
    }

    private int findNullCells() {
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (users[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }
}

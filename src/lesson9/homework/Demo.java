package lesson9.homework;

public class Demo {
    public static void main(String[] args) {
        User user1  = new User(10001, "tes1", "10001");
        User user2  = new User(10010, "tes2", "10010");
        User user3  = new User(10011, "tes3", "10011");
        User user4  = new User(10100, "tes4", "10100");
        User user5  = new User(10101, "tes5", "10101");
        User user6  = new User(10110, "tes6", "10110");
        User user7  = new User(10111, "tes7", "10111");
        User user8  = new User(11000, "tes8", "11000");
        User user9  = new User(11001, "tes9", "11001");
        User user10 = new User(11010, "tes10", "11010");
        User user11 = new User(11011, "tes11", "11011");
        User same   = new User(10001, "tes1", "10001");

        //saving
        UserRepository userRepository = new UserRepository();
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
        userRepository.save(user5);
        userRepository.save(user6);
        userRepository.save(user7);
        userRepository.save(user8);
        userRepository.save(user9);
        //userRepository.save(user10);
        //userRepository.delete(11001);
        //System.out.println(userRepository.save(user11));
        //System.out.println(userRepository.update(user10));
        System.out.println(userRepository.update(null));
        System.out.println(userRepository.update(user10));
        System.out.println(userRepository.update(user9));

    }
}

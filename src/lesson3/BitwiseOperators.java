package lesson3;

/**
 * Created by Admin on 14.05.2017.
 */
public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 60;     // 0011 1100 : in binary system
        int b = 13;     // 0000 1101 : in binary system
        int c = 0;      // 0000 0000 : in binary system

                         //      0011 1100
                         //     &0000 1101
                         //      ---------
        c = a & b;       // 12 = 0000 1100
        System.out.println("a & b = " + c);

                         //      0011 1100
                         //     |0000 1101
                         //      ---------
        c = a | b;       // 61 = 0011 1101
        System.out.println("a | b = " + c);

                         //      0011 1100
                         //     ^0000 1101
                         //      ---------
        c = a ^ b;       // 49 = 0011 0001
        System.out.println("a ^ b = " + c);
                         //      0011 1100
                         //    << 2 bits
                         //      ---------
        c = a << 2;       // 240 = 1111 0000
        System.out.println("a << 2 = " + c);
                         //      0011 1100
                         //    >> 2 bits
                         //      ---------
        c = a >> 2;       // 15 = 0000 1111
        System.out.println("a >> 2 = " + c);
    }
}

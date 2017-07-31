package lesson4;

/**
 * Created by Admin on 18.05.2017.
 */
public class ConcatString {
    public static String concat(String a, String b, String c){
        if(a != null && b != null && c != null)
            return a + b + c;
        else return "";
    }

    public static void main(String[] args) {
        System.out.println(concat("first string", " second string", " third string"));
    }
}

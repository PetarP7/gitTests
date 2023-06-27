import java.sql.SQLOutput;

public class class1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Smile usmivka");
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Second for loop");
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("");
        }


        addBigNumbers(234234L,8L);


    }
    public static long addBigNumbers(Long a, Long b) {
       return Long.MAX_VALUE - a + b;

    }


    public static void negative(){
        System.out.println("This is a negative number");
    }

}

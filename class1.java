public class class1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Smile usmivka");
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Second for loop");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }


        addNumbers(5,8);
        addNumbers(3,6);


    }
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        // return valueok
        return sum;
    }

    public static int abs(int a){
        return Math.abs(a);
    }

    public static double negative(int a){
        return -a;
    }

}

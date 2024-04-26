import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Primitive Types
        /*
         * byte - 1 [-128 to 127]
         * short -2
         * int - 4 (1,2,3,4,5)
         * long - 8
         * float - 4 (3.14)
         * double - 8
         * char - 2 (a,b,c,d)
         * boolean - 1 (true / false)
         * */

        byte age = 30;
        int phone = 1234567890;
        long phone2 = 12345678900L; // L define that it is long data type
        float pi = 3.14F; // F define that it is float data type
        char letter = 'a';
        boolean isAdult = true;

//        Non-primitive Types
//        String
        String name = "Foysal";
        System.out.println(name.length());

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());

//        Arrays
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(Arrays.toString(cars));
    }
}
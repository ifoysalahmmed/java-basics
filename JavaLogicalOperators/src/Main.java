import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        logical operators

//        && (if first and second both conditions are true then it returns true)

//        int a = 30;
        int a = 60;
        int b = 40;

        if (a < 50 && b < 50)
            System.out.println("both less than 50");
        else
            System.out.println("one of them is greater than 50");

//        || (if first and second condition both or anyone of them are true then it returns true)

        int c = 30;
        int d = 40;

        if (c < 50 || d < 50)
            System.out.println("at least one less than 50");
        else
            System.out.println("both is greater than 50");

//        not operator (!)
//        boolean isAdult = true;
        boolean isAdult = false;

//        if (isAdult==true)
//        if (isAdult)
        if (!isAdult)
            System.out.println("is adult");
        else
            System.out.println("not adult");

//
        Scanner sc = new Scanner(System.in);
//        pen = 10; notebook = 40;

        int cash = sc.nextInt();
        if (cash < 10) {
            System.out.println("cannot buy anything");
            System.out.println("get more cash");
        } else if (cash >= 10 && cash < 50) {
            System.out.println("can get 1 thing");
        } else {
            System.out.println("can get both");
        }
    }
}
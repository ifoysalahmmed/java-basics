import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int myNum = (int) (Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.println("Guess my number(1-100):");
            userNumber = sc.nextInt();

            if (userNumber == myNum) {
                System.out.println("WOOHOO...CORRECT NUMBER!!!");
                break;
            } else if (userNumber > myNum) {
                System.out.println("Your number is too large");
            } else {
                System.out.println("Your number is too small");
            }
        } while (userNumber >= 0);

        System.out.print("My number was: ");
        System.out.println(myNum);
    }
}
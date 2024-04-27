import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        How to take INPUT?
//        System.out.print("Input your age: ");
//
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        System.out.println("Your age is: " + age);

//        System.out.print("Input your name: ");
//
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next(); // take only a token or word
//
//        System.out.println("Your name is: " + name);

        System.out.print("Input your name: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Your name is: " + name);
    }
}
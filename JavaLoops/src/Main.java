public class Main {
    public static void main(String[] args) {
//        for loop

//        1 to 100
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }

//        100 to 1
//        for (int i = 100; i >= 1; i--) {
//            System.out.println(i);
//        }

//        while loop

//        100 to 1
//        int i = 100;
//        while (i >= 1) {
//            System.out.println(i);
//            i--;
//        }

//        do while loop

//        100 to 1
//        int j = 100;
//        do {
//            System.out.println(j);
//            j--;
//        } while (j >= 1);

//        Scanner sc = new Scanner(System.in);
//        int number = 1;
//
//        do {
//            System.out.println("input a number");
//            number = sc.nextInt();
//            System.out.print("here is your number : ");
//            System.out.println(number);
//        } while (number > 0);
//
//        System.out.println("THE END");

//        BREAK & CONTINUE
        int i = 0;
        while (true) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if (i > 5) {
                break;
            }
        }
    }
}
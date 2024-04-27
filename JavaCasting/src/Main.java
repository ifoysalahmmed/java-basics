public class Main {
    public static void main(String[] args) {
        double price = 100.00;
        double finalPrice = price + 18; // this is called implicit casting

        System.out.println(finalPrice);

        int p = 100;
        int fP = p + (int) 18.18; // this is called explicit casting

        System.out.println(fP);
    }
}
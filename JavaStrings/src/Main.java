public class Main {
    public static void main(String[] args) {
//        concatenate
        String name1 = "Aman";
        String name2 = "Appu";
        String name3 = name1 + " and " + name2;
//        System.out.println("Full name is: " + name3);

//        charAt
//        System.out.println(name1.charAt(0));
//        System.out.println(name1.charAt(1));

//        length
//        System.out.println(name2.length());

//        replace
        String updatedName = name1.replace("a", "b");
//        System.out.println(updatedName);
//        System.out.println(name1);

//        substring
        System.out.println(name3.substring(0, 4)); // last index is exclusive means it doesn't add
        System.out.println(name3.substring(5, 9)); // last index is exclusive means it doesn't add


    }
}
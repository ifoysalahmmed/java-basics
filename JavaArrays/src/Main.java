import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int age = 30;
        int physics = 97;
        int chem = 98;
        int eng = 95;

//        first write data types with [] than declare variable name then enter the values
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

//        Or, we can do it below way
//        int[] marks = {97, 98, 95};


//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

//        length
//        System.out.println(marks.length);

//        sort
//        System.out.println(marks[0]);
        Arrays.sort(marks);
//        System.out.println(marks[0]);

//        2D Arrays
        int[][] finalMarks = {{97, 98, 95}, {95, 95, 98}};
        System.out.println(finalMarks[0][0]);
        System.out.println(finalMarks[1][1]);
    }
}
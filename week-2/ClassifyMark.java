import java.util.Scanner;

public class Main {

    static String classifyMark(int mark) {
        if (mark < 0 || mark > 100) {
            return "Invalid mark";
        } else if (mark >= 80) {
            return "Distinction";
        } else if (mark >= 70) {
            return "Merit";
        } else if (mark >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mark = sc.nextInt();
        System.out.println(classifyMark(mark));

        // Test values:
        int[] testMarks = {-1, 0, 49, 50, 69, 70, 79, 80, 100, 101};

        for (int m : testMarks) {
            System.out.println(m + " -> " + classifyMark(m));
        }

        sc.close();
    }
}

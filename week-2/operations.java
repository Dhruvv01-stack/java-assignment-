import java.util.Scanner;

public class FinalValueOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter operation: ");
            String operation = sc.next();

            if (operation.contains("+")) {
                x++;
            } else {
                x--;
            }
        }

        System.out.println("Final value of X: " + x);

        sc.close();
    }
}

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of rows from the user
        int n = sc.nextInt();
        int columns; // Variable to store the number of columns in each row
        for (int i = 0; i < 2 * n; i++) {
            if (i > n) {
                columns = 2 * n - i; 
                //  printing '*' 
                for (int j = 1; j <= columns; j++) {
                    System.out.print("* ");
                }
            } else { 
                columns = i; 
                //printing '*' 
                for (int j = 1; j <= columns; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println(); //new line
        }
    }
}

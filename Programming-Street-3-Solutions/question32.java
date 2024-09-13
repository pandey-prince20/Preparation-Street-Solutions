import java.util.*;
public class question32{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Number of rows for the half diamond
    int n = 5;

    // Top half of the diamond (including middle row)
    for (int i = 1; i <= n; i++) {
        // Printing spaces
        for (int j = n - i; j > 0; j--) {
            System.out.print(" ");
        }
        // Printing stars
        for (int j = 1; j <= (2 * i - 1); j++) {
            System.out.print("*");
        }
        // Move to the next line
        System.out.println();
    }

    // Bottom half of the diamond
    for (int i = n - 1; i > 0; i--) {
        // Printing spaces
        for (int j = n - i; j > 0; j--) {
            System.out.print(" ");
        }
        // Printing stars
        for (int j = 1; j <= (2 * i - 1); j++) {
            System.out.print("*");
        }
        // Move to the next line
        System.out.println();
    }

    scanner.close();
}
}
import java.util.Scanner;

public class KrishnamurthyNumberCheck {

    
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    
    static boolean isKrishnamurthy(int n) {
        int sum = 0;
        int temp = n; // Store the original number for comparison

        while (temp != 0) {
            int digit = temp % 10; 
            sum += factorial(digit); 
            temp /= 10; t
        }

        
        return (sum == n);
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isKrishnamurthy(num)) {
            System.out.println(num + " is a Krishnamurthy number.");
        } else {
            System.out.println(num + " is not a Krishnamurthy number.");
        }
    }
}

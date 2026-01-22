public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;

        
        for (int i = 1; i <= n; ++i) {
            
            sum += i; // sum = sum + i
        }

        System.out.println("The sum of natural numbers from 1 to " + n + " is: " + sum);
    }
}

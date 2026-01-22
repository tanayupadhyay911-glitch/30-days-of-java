import java.util.Scanner;

public class InputProgram {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.println("Enter some text (type 'exit' to quit):");
            
            String userInput = scanner.nextLine();

            
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break; // Exit the while loop
            }

            System.out.println("You entered: " + userInput);

            
            int inputLength = userInput.length();
            if (inputLength > 0) {
                System.out.println("Counting down from the length of your input (" + inputLength + "):");
                for (int i = inputLength; i >= 1; i--) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
        System.out.println("Program finished.");
    }
}

public class Day12Strings{

    public static void main(String[] args) {

        // 1. Creating and printing a String
        String name = "Java Learner";
        System.out.println("Hello, " + name);

        System.out.println("--------------------------------");

        // 2. String Length
        String text = "Programming";
        System.out.println("Length of text: " + text.length());

        System.out.println("--------------------------------");

        // 3. String Comparison
        String s1 = "Java";
        String s2 = "Java";
        System.out.println("Strings equal? " + s1.equals(s2));

        System.out.println("--------------------------------");

        // 4. Uppercase & Lowercase
        String word = "Java";
        System.out.println("Uppercase: " + word.toUpperCase());
        System.out.println("Lowercase: " + word.toLowerCase());

        System.out.println("--------------------------------");

        // 5. String Concatenation
        String first = "Hello";
        String second = "World";
        String result = first + " " + second;
        System.out.println("Concatenated String: " + result);

        System.out.println("--------------------------------");

        // 6. Access character from String
        String lang = "Java";
        System.out.println("First character: " + lang.charAt(0));

        System.out.println("--------------------------------");

        // 7. Reverse a String
        String original = "Java";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}

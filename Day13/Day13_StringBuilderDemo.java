public class Day13_StringBuilderDemo {

    public static void main(String[] args) {

        // Example 1: String (Immutable)
        String s = "Java";
        s = s + " is";
        s = s + " powerful";
        System.out.println("Using String: " + s);

        System.out.println("--------------------------");

        // Example 2: StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is");
        sb.append(" powerful");
        System.out.println("Using StringBuilder: " + sb);

        System.out.println("--------------------------");

        // Insert text
        sb.insert(4, " language");
        System.out.println("After insert: " + sb);

        // Delete text
        sb.delete(4, 13);
        System.out.println("After delete: " + sb);

        // Reverse text
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Convert StringBuilder to String
        String finalResult = sb.toString();
        System.out.println("Converted to String: " + finalResult);
    }
}

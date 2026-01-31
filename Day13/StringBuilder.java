public class StringBuilder  {

    public static void main(String[] args) {

        // ----------- Using String -----------
        String str = "Java";
        System.out.println("Using String:");

        str = str + " Programming";
        str = str + " Language";

        System.out.println(str);

        System.out.println("-------------------------");

        // ----------- Using StringBuilder -----------
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Using StringBuilder:");

        sb.append(" Programming");
        sb.append(" Language");

        System.out.println(sb);

        System.out.println("-------------------------");

        // Insert example
        sb.insert(4, " Core");
        System.out.println("After insert: " + sb);

        // Delete example
        sb.delete(4, 9);
        System.out.println("After delete: " + sb);

        // Reverse example
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Convert to String
        String finalString = sb.toString();
        System.out.println("Converted to String: " + finalString);
    }
}

class Calculator {

    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(10, 20));
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.5));
    }
}

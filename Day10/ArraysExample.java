class ArraysExample {
    public static void main(String[] args) {

        
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;
        int max = numbers[0];

        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum of elements: " + sum);
        System.out.println("Maximum element: " + max);
    }
}

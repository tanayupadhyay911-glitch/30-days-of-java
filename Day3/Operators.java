class Opreators {
    public static void main(String[] args) {
        int x = 35;
        int y = 5;
        int sum=x+y;
        int dif=x-y;
        int mul=x*y;
        double div=x/y;
        int rem=x%y;
        
        
        System.out.println("x + y = "+ sum );
        System.out.println("x - y = "+ dif );
        System.out.println("x * y = "+ mul );
        System.out.println("x / y = "+ div );
        System.out.println("x % y = "+ rem );
        
        int max;
        
        
        max = (x > y) ? x : y;

       
        System.out.println("The maximum value is: " + max); // 
        
        
        int number = 7;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        
        System.out.println("The number " + number + " is: " + result);
        
        
        
        System.out.println("Bye See You On Day03");
    }
}
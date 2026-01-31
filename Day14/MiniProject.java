import java.util.Scanner;
class MiniProject{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the student :");
		String name = sc.nextLine();
		
		double sub=5;
		double sum = 0;
		
		for(int i=1;5>=i;i++){
			System.out.print("Enter the Marks of subject "+i+ " : ");
			int marks = sc.nextInt();
			sum+=marks;
			}
		 double avg= sum/sub;	
		
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + sum);
        System.out.println("Percentage: " + avg + "%");
		
		 if (avg >= 90) {
            System.out.println("Grade: A");
        } else if (avg >= 75) {
            System.out.println("Grade: B");
        } else if (avg >= 60) {
            System.out.println("Grade: C");
        } else if (avg >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
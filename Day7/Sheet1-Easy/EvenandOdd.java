import java.util.Scanner;
class EvenandOdd{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Enter a number :");
	int n = sc.nextInt();
	
	if(n%2==0 || n==0){
		System.out.println("This Number Is Even");
		}
	else{
	System.out.println("This Number is Odd");
	}
	
	sc.close();
	}
}	
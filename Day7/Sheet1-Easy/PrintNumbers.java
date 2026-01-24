import java.util.Scanner;
class PrintNumbers{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Enter the first number :");
	int n = sc.nextInt();
	
	System.out.print("Enter the last number :");
	int l = sc.nextInt();
	
	for(int i = n;l>=i;i++){
		System.out.println(i);
		}
	sc.close();
	}
	
}	
	
	
	
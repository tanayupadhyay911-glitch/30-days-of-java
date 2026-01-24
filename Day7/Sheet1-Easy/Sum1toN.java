import java.util.Scanner;
class Sum1toN{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Enter a number :");
	int n = sc.nextInt();
	int sum =0;
	for(int i =1;n>=i;i++){
		sum=i+sum;
		}
	System.out.print(sum);	
	sc.close();
	}
}	
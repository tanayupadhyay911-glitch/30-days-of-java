import java.util.Scanner;
class RevofNum{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Enter a number : ");
	
	int n = sc.nextInt();
	
	int i =0;
	int rev=0;
	
	while(n!=0){
		i=n%10;
		rev=(rev*10)+i;
		n=n/10;
		}
	
	System.out.print(rev);
		
	sc.close();
	}
}	
	
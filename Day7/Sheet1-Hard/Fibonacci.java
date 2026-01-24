import java.util.Scanner;
class Fibonacci{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("How many terms you want");
	int n = sc.nextInt();
	
	int x=0,y=1;
	System.out.print("Fibonacci Series up to " + n + " terms:");
	
	for(int i=1 ; n>=i;i++){
		System.out.print(x+ " " );
		int z=x+y;
		x=y;
		y=z;
		}
	sc.close();
	}
}	
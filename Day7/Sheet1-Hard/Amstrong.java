import java.util.Scanner;
class Amstrong{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number :");
		int n = sc.nextInt();
		int arm =0;
		while(n!=0){
			int i = n%10;
			arm = (i*i*i)+arm;
			n=n/10;
			}
		int nw=arm;
		int ori=n;
		
		if(nw==ori){
			System.out.print("The Given Number Is Amstrong Number :) ");
			}
		else{
			System.out.print("The Given Number Is Not An Amstrong Number :( ");
			}
		sc.close();
	}
}	
	
import java.util.Scanner;

class PallindromeNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
		
		int original = n;   
		int rev =0;
		
		while(n!=0){
			int i = n%10;
			rev=rev*10+i;
			n=n/10;
			}
		
		if(rev==original){
			System.out.print("The Given Number Is Pallindrome :)");
			}
		else{
			System.out.print("The Given Number Is NOT Pallindrome :(");
			}
		}
	}	
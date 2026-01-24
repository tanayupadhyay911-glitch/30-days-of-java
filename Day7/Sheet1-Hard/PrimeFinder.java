import java.util.Scanner;
class PrimeFinder{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a number :");
	int n = sc.nextInt();
	int count = 0,non =0;

	
	for(int i=1; n>=i; i++){
		if(n%i==0){
			count++;
			}
		else{
             non++;
			}
		}
	
	if(count>2){
		System.out.print("Given Number is Not Prime!");
		}
	else if(n==0){
		System.out.print("0 is neither prime nor composite;");
		}
	else{
		System.out.print("The Given Number is Prime! :)");
		}
	sc.close();
	}
}	
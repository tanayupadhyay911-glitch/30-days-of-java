import java.util.Scanner;
class Maxof3Nums{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Enter  number 1 :");
	int n1 = sc.nextInt();
	 
	System.out.print("Enter  number 2 :");
	int n2 = sc.nextInt();
	
	System.out.print("Enter  number 3 :");
	int n3 = sc.nextInt();
	
	if(n1>n2 && n1>n3){
		System.out.println("Number 1 Is Largest Among The Three ");
		}
	else if(n2>n1 && n2>n3){
		System.out.println("Number 2 Is Largest Among The Three ");
		}
	else{
	System.out.println("Number 3 IS Largest Among The Three ");
		}
	
	sc.close();
	}
}	
	
	
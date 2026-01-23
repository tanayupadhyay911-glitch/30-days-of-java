import java.util.Scanner;
class StarPatterI{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("How many Lines you want:");
	int n = sc.nextInt();
	
	for(int i=1 ; n>=i;i=i+1){
		for(int j =1 ;i>=j; j=j+1 ){
			System.out.print("*");}
		System.out.println();
		}
	
    sc.close();	
    }
}	
	
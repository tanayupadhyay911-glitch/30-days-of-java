class Methods{
	public static double discriment(double a, double b , double c){
		double D = (b*b)-(4*a*c);
		return D;
		}
	public static void main(String args []){
		//3x^2-7x=2=0
		double d;
		d =discriment(3.0,-7.0,2.0);
		System.out.println(d);
		sumton(10);
		
	}
	public static int sumton(int N){
	
		int n= N;
		int x=((n)*(n-1)/2);
		System.out.println("Sum of all numbers upto " + n + " is : " +x);
		return 0;
	}
		
}		
class PyramidPattern{
	public static void main(String args []){
		int row = 4;
		for(int i =1;row>=i;i++){
			for(int j=1;row>=j-i;j++){
				System.out.print(" ");
			}
			 for (int space = 1; space <= row- i; space++) {
                System.out.print(" ");
            }

            
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            
            System.out.println();
        }
    }
}
class ArrMed{
	public static void main(String args []){
		int []tu = {90,70,50,30,10};
		int sum=0;
		
		for(int i =0;tu.length>i ;i++){
			sum=sum+tu[i];
			}
		int avg =sum/tu.length;
		System.out.println("Average is : " +avg);
		
		System.out.println("Even numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
		
		 System.out.println("Reversed array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
		
		int search = 15;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number exists in array");
        } else {
            System.out.println("Number not found");
        }
		
				
			
	}
}
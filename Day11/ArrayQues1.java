class ArrayQues1{
	public static void main (String args[]){
		int[]t1={1,8,27,64,125,216,343};
		int sum= 0;
		int max=t1[0];
		int min=t1[0];
		
		for(int i=0; i<t1.length;i++){
			sum+=t1[i];
			
			
			if(t1[i]>max){
				max=t1[i];
			    }
			else if(t1[i]<min){
				min=t1[i];
		        }
		    }
        System.out.println("Sum of all num  in array is : " +sum);
		System.out.println("Max in the array is " +max);
		System.out.println("Min in the array is " +min);
		
		System.out.println("Rev of the array is ");	

		for(int i= t1.length-1; i>=0;i--){
			System.out.println(t1[i]);
			}
	}
}	
			
		
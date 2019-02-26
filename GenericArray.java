package codes;

import java.util.Arrays;


public class GenericArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]iarr= {3,4,1,2,5,9,7,6};
		Double[]darr= {3.3,4.2,1.5,2.9,6.0,5.4,9.3,7.2,8.6};
		Character[]carr= {'a','c','z','b','k','m','y','r'};
		findlargest(iarr);
		findlargest(darr);
		findlargest(carr);
	}
	
	
	 public static < E > void findlargest( E[] inputArray ) {
		 
		Arrays.sort(inputArray, 0, inputArray.length);
		
		System.out.println("largest in "+inputArray.getClass().getSimpleName()+" is: "+inputArray[inputArray.length-1]);
		System.out.println();
	 }

}

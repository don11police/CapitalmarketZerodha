package stringprogram;

import java.util.Arrays;

public class Arrayslargest {
	public static void main(String[] args) {
		int bbb [] = {2,5,2,5222,888,2552};
		int cc[] = {45,548,454,854,345,4};
		
		int max = Arrays.stream(bbb).max().getAsInt();
		
		int min = Arrays.stream(cc).min().getAsInt();
		 
		System.out.println("largest no. is  " + max);
		
		System.out.println("minimum no. is  " + min);
		
		int max1 = Arrays.stream(cc).max().getAsInt();
		System.out.println("max no." + max1);
		
	double avg = Arrays.stream(cc).average().getAsDouble();
		System.out.println();
		
	
		
	}
	

}

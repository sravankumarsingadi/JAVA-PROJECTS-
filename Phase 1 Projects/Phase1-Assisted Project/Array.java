package javaprograms;

public class Array {

		public static void main(String[] args) {

		//single-dimensional array
		int a[]= {15,20,30};
		for(int i=0;i<3;i++) {
		System.out.println(" a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {
		            {4, 6, 8, 10}, 
		            {6, 9, 12} };
		      
		      System.out.println("\nLength of row 2: " + b[0].length);
		      }
		}


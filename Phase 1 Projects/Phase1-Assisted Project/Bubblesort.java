package javaprograms;

public class Bubblesort {


	    public static void main(String[] args){

	     int[] arr= {34,22,55,4,77,98};
	     Bubblesort(arr);
	     for(int i=0;i<arr.length;i++){

	        System.out.println(arr[i]);
	        }
	    }

	    public static void Bubblesort(int[] arr){
	        int len = arr.length;
	        int temp = 0;
	        for(int i=0;i<len;i++){
	            for (int j=1;j<(len);j++){
	                if(arr[j-1]>arr[j]){
	                temp = arr[j-1];
	                arr[j-1]= arr[j];
	                arr[j]= temp;

	                }


	            }

	        }

	    }

	}


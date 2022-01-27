package javaprograms;

public class Callmethod {

		int val=250;

		int operation(int val) {
			val =val*10/100;
			return(val);
		}

		public static void main(String args[]) {
			Callmethod d = new Callmethod();
			System.out.println("Before operation value of data is "+d.val);
			d.operation(200);
			System.out.println("After operation value of data is "+d.val);
			}
		}


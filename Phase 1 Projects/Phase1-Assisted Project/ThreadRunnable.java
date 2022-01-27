package javaprograms;
	
	public class ThreadRunnable implements Runnable{
		 
	    public static int myCount = 0;
	    public ThreadRunnable(){
	         
	    }
	    public void run() {
	        while(ThreadRunnable.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++ThreadRunnable.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 
	    public static void main(String a[]){
	        System.out.println("Starting Main Thread...");
	        ThreadRunnable mrt = new ThreadRunnable();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(ThreadRunnable.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++ThreadRunnable.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");
	    }
	}

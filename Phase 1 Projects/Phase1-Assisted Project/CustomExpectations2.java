package javaprograms;

public class CustomExpectations2 {
   
        void Division() throws ArithmeticException
        {
            int a=55,b=0,rs;
rs = a / b;
            System.out.print("\n\tThe result is : " + rs);
        }
         public static void main(String[] args)
        {
CustomExpectations2 T = new CustomExpectations2();
             try
            {
                T.Division();
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }
            System.out.print("\n\tEnd of program.");
    
}

}

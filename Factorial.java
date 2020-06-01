
public class  Factorial
{

public static boolean  isPrime(int num )
{



}

public static long findFactorial(int  num)
{
    
    
     long result = 1;

         for(int i=num ; i>0;i--)
           {
              result = result * i;
            }

      return result ;
}

public static void main(String args[])
{

         int   num=Integer.parseInt(args[0]);
         long result = findFactorial( num );
         System.out.println(" Factorial of "+num+" = "+result);

}


}
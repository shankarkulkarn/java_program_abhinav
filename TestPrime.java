public class  TestPrime
{


public static void main(String args[])
{

        int  num = Integer.parseInt(args[0]);
         
        boolean flag = MathUtil.isPrime(num);
        if( flag == true)
          System.out.println(" Number is Prime ");
        else
          System.out.println(" Number is Composite ");

}

}
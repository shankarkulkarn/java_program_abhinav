public class  TestFactorial
{


public static void main(String args[])
{

        int  num = Integer.parseInt(args[0]);
 
        MathUtil  obj = new MathUtil();

        long result = obj.factorial(num);

        System.out.println(" Factorial of "+num+" = "+result); 
       

}

}
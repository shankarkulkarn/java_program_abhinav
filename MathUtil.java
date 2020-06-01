public  class MathUtil
{

public static long  factorial(int num)
{

int   result  = 1;
for(int i=1;i<=num;i++)
{
      result *= i;    //  result = result * i ;
}

   return result ;
}

public static boolean isPrime(int num)
{
     boolean  flag = (num==1)?false:true;

     for(int i=2;i<=Math.sqrt(num);i++)
       {
             if( num%i == 0)
              {
                 flag = false;
                 break ;  
              }
               
       }

      
     return flag ;
}

public static boolean isPalindrome(int num)
{


        return true;
}

public  static  int   primeDigitSum(int num)
{
        int sum = 0;
        int rem = 0;
        

        while( num > 0 )
        {
           rem =  num % 10 ;
           if ( isPrime(rem)== true )
             {
		sum += rem ;

             }
          
           num = num / 10;
        } 
                return sum ;

}


}






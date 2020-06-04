public class  TestArray
{


public static void main(String args[])
{

        int [] arr1 = {11,8,3,12,5};
        int  []   arr2 =  new int[10];

        System.out.println( arr1 );
        System.out.println( arr2 );
        System.out.println( arr1.length);
        System.out.println( arr2.length );
        
        
        for(int i=0; i<arr1.length;i++)
         {
          System.out.print( arr1[i] +"   ");
         }
         System.out.println();
         for( int num : arr1 )
            {
             long result = MathUtil.factorial(num);
               System.out.print(result +"   ");   
             }

}

}
import java.util.Arrays;
public class  TestArray1
{


public static void main(String args[])
{

        int [] arr = {11,8,3,12,5};
        
        Arrays.sort( arr,0,3);

        for(int num :  arr )
        {
           System.out.print(num+"  ");

        }
        

}

}

import  java.util.Scanner ;

public class  Apps
{


public static void main(String args[])
{
          
        Scanner  scr = new Scanner(System.in);
        
         
         while(true)
	{

          System.out.println("1.Factorial \n 2. prime \n 3. PrimeDigit \n 4. Exit ");
          System.out.println(" Enter your choice ");
          int choice = scr.nextInt();
          
         switch(choice)
          {
                    case   1 :  break;
                    case   2 :  break;
                    case   3 :  break;
                    case   4 : System.out.println("Bye..."); System.exit(0);

          }
           


	}
        

}

}
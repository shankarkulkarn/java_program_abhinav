
import  java.util.Scanner ;

public class  Input
{


public static void main(String args[])
{
          
        Scanner  scr = new Scanner(System.in);
        System.out.println(" Enter any number ");
        int num = scr.nextInt();   // scanf("%d",&num); cin>>num 

        System.out.println(" Enter any  decimal number ");

         double   avg = scr.nextDouble();

       System.out.println(" Enter your name ");
        String  str = scr.next();
        System.out.println(str+"  "+num+"  "+avg+"  ");
        
        

}

}
import java.util.*;
public class Swap
{
    public static void main(String arg[])
       {    
           Scanner sc = new Scanner(System.in);
           System.out.println("Before Swapping  ");
           int x = sc.nextInt();       // Variables Declaration
           int y = sc.nextInt();
           x = x *y ;                         // Logic
           y = x /y; 
           x = x /y;
           System.out.println("After Swapping="+x +" "+y);
       }
}
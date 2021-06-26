import java.util.*;
public class Number
{
        public static void main(String arg[])
          {
              Scanner sc  = new Scanner(System.in);
              System.out.println("Enter The Number :");
              int n=sc.nextInt();
              if((n&1)==0)
              System.out.println("Number is Even");
              else              
              System.out.println("Number Is Odd");
              }
}
      
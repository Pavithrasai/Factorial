import java.io.*;
import java.util.*;
import java.lang.*;
 
class Factorial
{
   public static void main(String args[])
   {
      int n, i, fact = 1;
 
      System.out.println("Enter an integer to calculate the  factorial");
      Scanner sc= new Scanner(System.in);
 
      n = sc.nextInt();
 
      if ( n < 0 )
         System.out.println("Number should be non-negative.");
      else
      {
         for ( i = 1 ; i <= n ; i++ )
            fact = fact*i;
 
         System.out.println("Factorial of "+n+" is = "+fact);
      }
   }
}

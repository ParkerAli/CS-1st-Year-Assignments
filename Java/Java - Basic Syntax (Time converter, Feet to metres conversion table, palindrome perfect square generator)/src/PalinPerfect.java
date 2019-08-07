import java.util.Scanner;
import static java.lang.Math.sqrt;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
class PalinPerfect
{
   public static void main(String [] args)
   {
      Scanner keyboard= new Scanner(System.in);
      
      System.out.println("Enter the starting point N:");
      int start = keyboard.nextInt();
      
      System.out.println("Enter the ending point M:");
      int end = keyboard.nextInt();
      
      int count = start;
      String countS;
      String reverse;
      
      StringBuilder str;
      String build= Integer.toString(count);  
      System.out.println("The palindromic perfect squares are as follows:");
      if (start-end!=0){
      while (count != end+1)
      {
         countS= Integer.toString(count);
         if((int)((Math.sqrt(count))*(Math.sqrt(count)))== ((int)(Math.sqrt(count)))*((int)(Math.sqrt(count))) && count != 0)
         {   
            str = new StringBuilder(countS);
            if(str.reverse().toString().equals(countS))
            {
               System.out.println(count);
            }
         
         
         }
         count++;
      }}   
      
   }
}
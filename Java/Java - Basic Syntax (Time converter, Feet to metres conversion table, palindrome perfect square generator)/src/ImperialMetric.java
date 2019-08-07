import java.util.Scanner;
class ImperialMetric
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter the minimum number of feet (not less than 0):");
      int start = keyboard.nextInt();
      
      System.out.println("Enter the maximum number of feet (not more than 30):");
      int end = keyboard.nextInt();
      
      System.out.printf("%4s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s\n", "|","0\"","1\"","2\"","3\"","4\"","5\"","6\"","7\"","8\"","9\"","10\"","11\"");
      double feet=0.3048;
      double inches=0.0254;
      
      int count=start;
      
      while(count!= end+1)
      {  
         if (count<10){System.out.printf("%-3s",count+"'");
         System.out.printf("%-2s%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f\n", "|",(feet*count),(feet*count+inches),(feet*count+inches*2),(feet*count+inches*3),(feet*count+inches*4),(feet*count+inches*5),(feet*count+inches*6),(feet*count+inches*7),(feet*count+inches*8),(feet*count+inches*9),(feet*count+inches*10),(feet*count+inches*11));
         count++;}
         else{System.out.printf("%-1s",count+"'");
         System.out.printf("%-2s%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f%-6.3f\n", "|",(feet*count),(feet*count+inches),(feet*count+inches*2),(feet*count+inches*3),(feet*count+inches*4),(feet*count+inches*5),(feet*count+inches*6),(feet*count+inches*7),(feet*count+inches*8),(feet*count+inches*9),(feet*count+inches*10),(feet*count+inches*11));
         count++;}
      }








   }
}
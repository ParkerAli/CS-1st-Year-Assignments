import java.util.Scanner;
public class Meteorology
{  public static void main (String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      Collator temp = new Collator("Temperature");
      Collator pres = new Collator("Pressure");
      Collator hum = new Collator("Humidity");
      
      System.out.println("Meteorology Program");
      System.out.println("Make a selection and press return:");
      System.out.println("1. Record a temperature reading.");
      System.out.println("2. Record a pressure reading.");
      System.out.println("3. Record a humidity reading.");
      System.out.println("4. Print maximum values.");
      System.out.println("5. Print minimum values.");
      System.out.println("6. Print average values.");
      System.out.println("7. Quit.");
      
      int choice= keyboard.nextInt();
      int reading;
      
      while (choice!=7)
      {  if(choice==1 || choice==2 || choice==3){System.out.println("Enter value:");}
         if (choice==1){reading = keyboard.nextInt(); temp.recordReading(reading);}
         else if(choice==2){reading = keyboard.nextInt(); pres.recordReading(reading);}
         else if(choice==3){reading = keyboard.nextInt(); hum.recordReading(reading);}
         
         else if(choice==4)
         {  System.out.print("Maximum temperature: ");
            if(temp.numberOfReadings()==0){System.out.print("-\n");}
            else{System.out.print(temp.maximum()+"\n");}
            
            System.out.print("Maximum pressure: ");
            if(pres.numberOfReadings()==0){System.out.print("-\n");}
            else{System.out.print(pres.maximum()+"\n");}
            
            System.out.print("Maximum humidity: ");
            if(hum.numberOfReadings()==0){System.out.print("-\n");}
            else{System.out.print(hum.maximum()+"\n");}            
         }   
         
         else if(choice==5)
         {  System.out.print("Minimum temperature: ");
            if(temp.numberOfReadings()==0){System.out.print("-\n");}
            else{System.out.print(temp.minimum()+"\n");}
            
            System.out.print("Minimum pressure: ");
            if(pres.numberOfReadings()==0){System.out.print("-\n");}
            else{System.out.print(pres.minimum()+"\n");}
            
            System.out.print("Minimum humidity: ");
            if(hum.numberOfReadings()==0){System.out.print("-\n");}
            else{System.out.print(hum.minimum()+"\n");}            
         }
         
         else if(choice == 6)     //String.format( "%.2f", dub ) 
         {  System.out.print("Average temperature: ");
            if(temp.numberOfReadings()==0){System.out.print("-\n");}
            else{System.out.print(String.format( "%.2f", temp.average())+"\n");}
            
            System.out.print("Average pressure: ");
            if(pres.numberOfReadings()==0){System.out.print("-\n");}
            else{System.out.print(String.format( "%.2f", pres.average())+"\n");}
            
            System.out.print("Average humidity: ");
            if(hum.numberOfReadings()==0){System.out.print("-\n");}
            else{System.out.print(String.format( "%.2f", hum.average())+"\n");}     
         }
         
         else{;}
      System.out.println("Make a selection and press return:");
      System.out.println("1. Record a temperature reading.");
      System.out.println("2. Record a pressure reading.");
      System.out.println("3. Record a humidity reading.");
      System.out.println("4. Print maximum values.");
      System.out.println("5. Print minimum values.");
      System.out.println("6. Print average values.");
      System.out.println("7. Quit.");
      
      choice= keyboard.nextInt();

         
   
      }
   
   }
}
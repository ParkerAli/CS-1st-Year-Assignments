public class TestCollator
{
   public static void main(final String [] args)
   {
      Collator collator= new Collator("Test");
      
      System.out.println("Test 1");  //label works

      collator.label("poes");
      if (collator.label() .equals("poes")){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 2"); //initial readings 0
            
      if (collator.numberOfReadings()==0){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 3"); //initial max 0
      
      if (collator.maximum()==0){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 4"); //initial min 0
      
      if (collator.minimum()==0){System.out.println("Pass");}
      else{System.out.println("Fail");} 
      
      System.out.println("Test 5"); //readings = 1 + min=max
      
      collator.recordReading(3);
      if (collator.maximum()==3){System.out.println("Pass");}
      else{System.out.println("fail");}
      
      System.out.println("Test 6");
      
      if(collator.numberOfReadings()==1){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 7");
      
      if (collator.minimum()==3){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 8");
      
      if (collator.average()==3.0){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      
      System.out.println("Test 9"); 
   
      collator.recordReading(-2);
      if (collator.minimum()==-2) {System.out.println("Pass");}
      else{System.out.println("fail");}
      
      System.out.println("Test 10");
      
      if (collator.maximum()==3){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 11");
      
      if(collator.numberOfReadings()==2){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 12");     
      
      if(collator.average() == 0.5){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 13");
      
      collator.recordReading(2);
      if (collator.numberOfReadings() == 3){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 14");
      
      if (collator.minimum()==-2){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 15");
      
      if (collator.maximum()==3){System.out.println("Pass");}
      else{System.out.println("Fall");}
      
      System.out.println("Test 16");
      
      if (collator.average()==1.0){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 17");
      
      collator.label("fuckoff");
      if(collator.label().equals("fuckoff")){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      
      System.out.println("Test 18");
      
      collator.recordReading(0);
      if (collator.numberOfReadings() == 4){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 19");
      
      if (collator.minimum()==-2){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 20");
      
      if (collator.maximum()==3){System.out.println("Pass");}
      else{System.out.println("Fall");}
      
      System.out.println("Test 21");
      
      if (collator.average()==0.75){System.out.println("Pass");}
      else{System.out.println("Fail");}

      
   }
}
      
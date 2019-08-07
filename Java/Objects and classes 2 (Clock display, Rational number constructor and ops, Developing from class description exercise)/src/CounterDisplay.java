public class CounterDisplay
{
   private int value;
   private int limit;   
   
   public CounterDisplay(int pLimit) // Create a new CounterDisplay,set counter value to 0 and set the limit to pLimit.
   {
      value=0;
      this.limit=pLimit;
   }
   
   public void setValue(int pValue) // Set the current counter value to pValue.
   {
      this.value=pValue;
   }
   
   public int getValue() // Get the current value.
   {
      return value;
   }
   
   public void increment() // Advance the counter by 1, rolling over to 0 if the limit is reached.
   {  
      value+=1;
      if (value==limit){value=0;}      
   }
   
   public String getDisplayValue() //Obtain the display value i.e. the current counter value in the form of a 2 digit string.
   {  if (Integer.toString(value).length()>1){return Integer.toString(value);}
      else{return "0"+Integer.toString(value);}
   }


}
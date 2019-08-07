public class ClockDisplay
{

   private CounterDisplay hours;
   private CounterDisplay minutes;
   
   public ClockDisplay(int pHours,int pMinutes)   // Create a new ClockDisplay and set the display value to pHours and pMinutes.
   {
      this.hours= new CounterDisplay(24);
      this.hours.setValue(pHours);
      this.minutes = new CounterDisplay(60);
      this.minutes.setValue(pMinutes);
      this.setTime(pHours, pMinutes);
   }
      
   public void setTime(int pHours, int pMinutes)// Set the display value to pHours and pMinutes.
   {
      this.hours.setValue(pHours);
      this.minutes.setValue(pMinutes);
   }
   
   public void tick()// Advance the display time by one minute.
   {
   minutes.increment();
   if (minutes.getValue()==0){hours.increment();}
   }
   
   public String getDisplayValue()//Obtain the display value; a String composed of 2 digits for hours then a colon, then 2 digits for minutes.
   {
      return hours.getDisplayValue()+":"+minutes.getDisplayValue();
   }
   
}  
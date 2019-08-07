public class Plan
{
   private String PName;
   private int callRate;
   
   public Plan(String name, int rate)
   {
      PName= name;
      callRate= rate;
   }
   
   public int chargeCalc(int secs) //calculates cost of call
   {
      return secs*callRate;      
   }
   public void setName(String name)
   {
      PName= name;   
   }
   
   public String getName()//returns name
   {
      return PName;
   }
   
   public void setRate(int rate)
   {  callRate=rate;}
   
   
   public int getRate() //returns rate
   {
      return callRate;
   }
   
   public void editPlan(Plan planObject,String name,int callRate) //edits the plan object to update rate
   {
      planObject = new Plan(name,callRate);
   }
   
}
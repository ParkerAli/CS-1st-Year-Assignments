public class Account
{
   private String number;
   private Plan planObject; 
   private int balance;     
   
   public Account(String aNumber, Plan aPlan)
   {  balance=0;
      this.number=aNumber;
      planObject = aPlan;
   }
   
   public String getNumber() //returns account number
   {  return number;}
   
   public void topUp(int amount) //adds to balance
   {
      balance+=amount;
   }
   
   public void callCharge(int time) //charges account for airtime
   {  balance-= planObject.chargeCalc(time);} 
   
      
   public int getBalance()
   {
    return  balance;
   }
}
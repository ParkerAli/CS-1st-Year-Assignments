public class TestAccount
{
   public static void main(String [] args)
   {
      Plan p1=new Plan("Cheap Account",3);  // Plan object containing a plan called Cheap account with a call rate of 2c/second
     
      System.out.println("Test Account class");
      
      Account a1= new Account("2345678", p1);
      
      System.out.println("Test 1");//Test getNumber to get account number
      if(a1.getNumber()=="2345678"){System.out.println("Pass");}
      else{System.out.println("Fail");}
      
      System.out.println("Test 2");//Test getBalance to check for correct balance
      if(a1.getBalance()==0){System.out.println("Pass");}
      else{System.out.println("Fail");}      
  
      
      System.out.println("Test 3");//Test topup to check if balance increases
      a1.topUp(100); //100 cents added to balance
      if(a1.getBalance()==100){System.out.println("Pass");}
      else{System.out.println("Fail");}            
      
      System.out.println("Test 4");//Test callCharge to check if balance decreases correctly
      a1.callCharge(10); //charge for a 10 second call = 3c*10=30
      if(a1.getBalance()==70){System.out.println("Pass");}
      else{System.out.println("Fail");}            
   
   }   
}
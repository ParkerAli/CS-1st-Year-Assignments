public class Currency
{
   private String symbol;
   private String code;
   private int minorPerMajor;
   
   public Currency(String symbol, String code, int minorPerMajor){
      this.symbol=symbol;
      this.code=code;
      this.minorPerMajor=minorPerMajor;
   }   
   public String symbol(){
      return symbol;
   }   
   public String code(){ 
      return code;
   }
   public int minorPerMajor(){
      return minorPerMajor;
   }
   public String format(long amount){
      double initial = amount / minorPerMajor();
      long major= (long)initial;                //small units
      long minor= amount - major*minorPerMajor; //large units
      if(minor<10){return symbol+major+".0"+minor;}
      else{return symbol+major+"."+minor;}
   }
   
   public long parse(String amount){
      String minor;
      String major;
      int i=0;
      while(!amount.substring(i,i+1).equals(".")){i++;}
      if (amount.substring(0,1).equals("-")){major = amount.substring(2,i); minor = amount.substring(i+1);}
      else {major = amount.substring(1,i); minor = amount.substring(i+1);}
      long total = Integer.parseInt(major)*minorPerMajor()+ Integer.parseInt(minor);
      return total;
   }

   
   



}
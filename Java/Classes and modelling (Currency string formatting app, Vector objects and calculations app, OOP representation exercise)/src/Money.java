public class Money
{
   private Currency currency;
   private long minorUnitAmount;
   
   public Money(String amount, Currency currency){
      this.currency = currency;
      this.minorUnitAmount = currency.parse(amount);                                    
   }   
   public Money(long minorUnitAmount, Currency currency){
      this.minorUnitAmount=minorUnitAmount;
      this.currency=currency;
   }
   public long longAmount(){            
      return minorUnitAmount;
   }
   public Currency currency(){
      return currency;
   }
   
   public Money add(Money other){
      long total=other.longAmount()+ minorUnitAmount;
      return new Money(total,currency);
   }
   
   public Money subtract(Money other){
      long total= minorUnitAmount-other.longAmount();
      return new Money(total,currency);
   }
   public String toString(){
      return currency.format(minorUnitAmount);
   }
   
   
   




}
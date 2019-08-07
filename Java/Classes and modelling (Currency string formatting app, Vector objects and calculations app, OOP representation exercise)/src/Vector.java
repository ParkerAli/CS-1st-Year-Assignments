import java.lang.Math;
public class Vector
{  
   private double x;
   private double y;
   
   public Vector(double x, double y){
      this.x = x;
      this.y = y;
   }
   public double getMagnitude(){
      return Math.sqrt(x*x+y*y);
   }
   public double getX(){return x;}
   public double getY(){return y;}   
   
   public Vector add(Vector other){
      return new Vector(x+other.getX(),y+other.getY());
   }
   
   public Vector multiply(double m){
      return new Vector(x*m,y*m);
   }
   public double dotProduct(Vector other){
      return x*other.getX()+y*other.getY();
   }
   public String toString(){
      return String.format("v = (%.2f, %.2f)", x, y);
   }







}
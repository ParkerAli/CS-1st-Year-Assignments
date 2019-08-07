public class Student
{
   private String fName;
   private String mName;
   private String lName;
     
   public void setNames(String first, String middle, String last) // Set the first, middle and last names of this Student object.
   {
      this.fName = first;
      this.mName = middle;
      this.lName = last;

   }

   public String getFullName() // Obtain the full name of this Student with the middle name converted to an initial only.
   {
      return fName+" "+mName.charAt(0)+". "+lName;
   }
}
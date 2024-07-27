
package datetest;

public class Date
{
   private int month;
   private int date;
   private int year;
   public Date(int month,int date, int year){
       this.month=month;
       this.year=year;
       this.date=date;
   }
   public void setDate(int date){
       this.date=date;
   }
   public void setMonth(int month){
       this.month=month;
   }
   public void setYear(int year){
       this.year=year;
   }
   public int getDate(){
       return this.date;
   }
   public int getMonth(){
       return this.month;
   }
   public int getYear(){
       return this.year;
   }
   public void displayDate(){
       System.out.println(this.month+"/"+this.date+"/"+this.year);
   }
   
   
   
}

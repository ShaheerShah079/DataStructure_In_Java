package accounttest;

import java.util.Date;

public class Account
{ 
        private int id;
        private double balance;
        private double annualInterestRate;
        Date dateCreated ;
    public Account(){
        this.id=0;
        this.balance=0;
        this.annualInterestRate=0;
        dateCreated=new Date();
    }    
  public Account(int id,double balance){
        this.id=id;
        this.balance=balance; 
        this.annualInterestRate=1200;
        dateCreated= new Date();
  }  
  public void setId(int id){
        this.id=id; 
  }
  public void setBalance(double balance){
        this.balance=balance;
  }
  public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=0;
  }
  public int getId(){
      return this.id;
  }
   public double getBalance(){
      return this.balance;
  }
   public double getAnnualInterestRate(){
      return this.annualInterestRate;
  }
  public Date getDate(){
      return this.dateCreated;
  } 
  public double getMonthlyInterestRate(){
      return this.annualInterestRate/12;
  }
  public void withdraw(double amount){
      this.balance-=amount;
  }
  public void deposits (double amount){
      this.balance+=amount;
  }  
  
   
    
}

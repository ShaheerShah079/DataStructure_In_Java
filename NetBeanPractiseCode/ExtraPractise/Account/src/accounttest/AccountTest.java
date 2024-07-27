package accounttest;

public class AccountTest
{
    public static void main(String[] args)
    {
        Account a= new Account(1222,20000);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposits(3000);
        System.out.println("Balance :"+a.getBalance()+"\nMonthly interest : "+a.getMonthlyInterestRate()
        +"\n Date : "+a.getDate());
    }
    
}

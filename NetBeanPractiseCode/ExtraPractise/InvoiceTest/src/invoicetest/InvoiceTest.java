package invoicetest;

public class InvoiceTest
{
    public static void main(String[] args)
    {
   Invoice i = new Invoice("12lN1","des",8,96);
   i.setPrice(103.2);
        System.out.println(i.getInvoiceAmount());
    }
   
   
   
}

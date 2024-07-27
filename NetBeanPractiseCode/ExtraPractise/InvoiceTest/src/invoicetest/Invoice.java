
package invoicetest;

public class Invoice
{
  private String partNumber;
  private String partdescription;
  private int quantity;
  private double price;
  public Invoice(String partNumber,String partdescription,int quantity,double price){
      this.partNumber=partNumber;
      this.partdescription=partdescription;
      this.quantity=quantity;
      this.price=price;
  }
  public void setPartNumber(String partNumber){
      this.partNumber=partNumber;
  }
  public void setPartDescription(String partdescription){
      this.partdescription=partdescription;      
  }
  public void setQuantity(int quantity){
      this.quantity=quantity;      
  }
  public void setPrice(double price){
      this.price=price;      
  } 
  public String getPartNumber(){
      return this.partNumber;
  }
  public String getPartDescription(){
      return this.partdescription;      
  }
  public int getQuantity(){
      return this.quantity;      
  }
  public double getPrice(){
      return this.price;      
  }         
  public double getInvoiceAmount(){
      if(this.quantity<0) this.quantity=0;
      else if(this.price<0) this.price=0.0;
      
      return (this.quantity*this.price);
  } 
  
  
  
}

package employeetest;

public class Employee
{
private String firstName;
private String lastName;
private double salary;
public Employee(String firstName,String lastName,double salary){
    this.firstName=firstName;
    this.lastName=lastName;
    if(salary>0)
    this.salary=salary;
}
public void setFirstName(String firstname){
   this.firstName=firstName;
    
}
public void setLastName(String lastName){
    this.lastName=lastName;
}
public void setSalary(double salary){
      if(salary>0)this.salary=salary;
}
public String getFirstName(){
   return this.firstName; 
}
public String getLastName(){
   return this.lastName; 
}
public double getSalary(){
    return this.salary; 
}

}

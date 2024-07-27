
package employeetest;


public class EmployeeTest
{

    public static void main(String[] args)
    {
        Employee e1=new Employee("Ali","Hassan",12421.43);
        Employee e2=new Employee("Hasham","Khan",1433.43);
        System.out.println("Salary of Employee1 is "+e1.getSalary());
        System.out.println("Salary of Employee2 is "+e2.getSalary());
        e1.setSalary(e1.getSalary()*1.10);
        e2.setSalary(e2.getSalary()*1.10);
        System.out.printf("Salary of Employee1 after increment %.2f\n",e1.getSalary());
        System.out.printf("Salary of Employee2 after increment %.2f\n",e2.getSalary());
        
        
    }
    
}

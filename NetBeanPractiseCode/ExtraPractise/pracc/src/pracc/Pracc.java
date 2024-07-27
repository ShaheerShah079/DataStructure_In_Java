
package pracc;

interface A
{
    public void me();
}        

interface B
{
    public void me();
}        
public class Pracc 
{
    public static void main(String[] args)
    {
        char s='A';
        ClassAA ob=new ClassAA();
        System.out.println(ob.add(s));
    }

    
}
class ClassAA
{
    public double add(byte a)
    {
        return a;
    }
}
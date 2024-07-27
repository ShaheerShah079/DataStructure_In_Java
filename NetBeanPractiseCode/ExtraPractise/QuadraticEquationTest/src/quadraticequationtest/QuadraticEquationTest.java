package quadraticequationtest;

import java.util.Scanner;

public class QuadraticEquationTest
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of a,b&c");
        QuadraticEquation q = new QuadraticEquation(in.nextInt(),in.nextInt(),in.nextInt());
        if(q.getDiscriminant()>0){
            System.out.println("Root 1 is "+q.getRoot1()+" and Root 2 is "+q.getRoot2());
        }
        else if(q.getDiscriminant()==0){
            System.out.println("Root is "+q.getRoot1());
        }
        else{
            System.out.println("The equation has no roots.");
        }
        
        
    }
    
}

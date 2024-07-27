/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abubakarpractise;

/**
 *
 * @author Personal's PC
 */
public class Abubakarpractise
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       DMarksher l= new DMarksher("Abubaker",1234); 
        System.out.println(l);
    }
    
}

class DMarksher{
    String Student_name;
    int rollno;
    String[] subject;
    double [] mark;
    
    void setStudent_name(String x){
       Student_name=x; 
    }
    String getStudent_name(){
        return Student_name;
    }
    DMarksher(){
        Student_name=null;
        rollno=0;
        
    }
    DMarksher(String a ,int b){
        Student_name=a;
        rollno=b;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
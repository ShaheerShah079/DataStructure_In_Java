package quadraticequationtest;

public class QuadraticEquation
{
  private int a;
  private int b;
  private int c;
  public QuadraticEquation(int a,int b,int c){
      this.a=a;
      this.b=b;
      this.c=c;
  }
  public int getA(){
      return this.a=a;
  }
  public int getB(){
      return this.b=b;
  }
  public int getC(){
      return this.c=c;
  }
  public int getDiscriminant(){
      return (b*b)-(4*a*c);
  }
  public double getRoot1(){
      if(getDiscriminant()<0){
          return 0;
      }
      else{
          return ((-b+Math.sqrt(getDiscriminant()))/2*a);
      }
  }
  public double getRoot2(){
      if(getDiscriminant()<0){
          return 0;
      }
      else{
          return ((-b-Math.sqrt(getDiscriminant()))/2*a);
      }
  }
  
  
}

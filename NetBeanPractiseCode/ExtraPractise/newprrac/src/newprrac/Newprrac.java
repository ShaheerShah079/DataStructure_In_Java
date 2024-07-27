package newprrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Complete the classes below
class Flower {
    String whatsYourName(){
    return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    String whatsYourName(){
    return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    String whatsYourName(){
    return "Lotus";
    }
}

class Region {
    
    Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region  {
    @Override
    Jasmine yourNationalFlower(){
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
     @Override
    Lily yourNationalFlower(){
        return new Lily();
    }
}


public class Newprrac {
  public static void main(String[] args) {
//      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//      String s = reader.readLine().trim();
//      Region region = null;
//      switch (s) {
//        case "WestBengal":
//          region = new WestBengal();
//          break;
//        case "AndhraPradesh":
//          region = new AndhraPradesh();
//          break;
//      }
//      Flower flower = region.yourNationalFlower();
// System.out.println(flower.whatsYourName());
  
     Scanner in = new Scanner(System.in);
//        String a=in.next();
//        String b =in.next();
//          BigInteger a1=new BigInteger(a);
//          BigInteger b1 =new BigInteger(b);
//        if(a.length()<=200&&b.length()<=200&&a1.compareTo(new BigInteger("-1"))==1&&b1.compareTo(new BigInteger("-1"))==1){
//        
////            System.out.println();
//            System.out.println(a1.add(b1));
//            System.out.println(a1.multiply(b1));
//            
//        }
//        else{
//            
//        }



//int arr[]={1,8,9,11,2,6};
//int position;
//for(int i=0;i<arr.length;i++){
//    int max=arr[i];
//    position =i;
//    int j=i+1;
//    for(;j<arr.length;j++){
//        if(arr[j]>max){
//            max=arr[j];
//            position=j;
//        }
//        
//    }
//    int temp=arr[position];
//        arr[position]=arr[i];
//        arr[i]=temp;
//        System.out.println(i+" "+arr[i]+" ");
//}
//  
//  for(int i=0;i<arr.length;i++){
//      System.out.println(arr[i]+" ");
//  }
//   String s ="000.000";
//BigDecimal b =new BigDecimal(s);//.valueOf(Double.parseDouble(s));
//      System.out.println(b);


//   Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        String []s=new String[n+2];
//        for(int i=0;i<n;i++){
//            s[i]=sc.next();
//        }
////        System.out.println("Make big decimal");
//        sc.close();
//        BigDecimal [] b=new BigDecimal[n];
//        BigDecimal temp;
//        for(int i=0;i<n;i++){
////            System.out.println("Initiate big decimal");
//            b[i]=new BigDecimal(s[i]);
//        }
//try{        
//        //Write your code here
//         int position;
//         for(int i=0;i<b.length;i++){
////             System.out.println("in i"+i);
//             BigDecimal max =b[i];
//             position =i;
//             
//             for(int j=i+1;j<b.length;j++){
////                 System.out.println("in j"+j);
//                 if(b[j].compareTo(max)==1){
//                     
//                     max=b[j];
////                     System.out.println("in if else"+max);
//                     position =j;
//                 }
//             }
////             System.out.println("After j with position"+position);
//            temp=b[position];
//             b[position]=b[i];
//             b[i]=temp;
//             String temp1=s[position];
//             s[position]=s[i];
//             s[i]=temp1;
////             s[i]=b[i].toString();
//         } 
//        //Output
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(s[i]);
//        }
//}
//catch(Exception e){
//    System.out.println("LAg gay yaha");
//}
//  
//  
//try{
//			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//			int n1=Integer.parseInt(br.readLine());
//			int n2=Integer.parseInt(br.readLine());
//			int n3=Integer.parseInt(br.readLine());
//			int n4=Integer.parseInt(br.readLine());
//			int n5=Integer.parseInt(br.readLine());
//			int n6=Integer.parseInt(br.readLine());
//			Add ob=new Add();
//			ob.add(n1,n2);
//			ob.add(n1,n2,n3);
//			ob.add(n1,n2,n3,n4,n5);	
//			ob.add(n1,n2,n3,n4,n5,n6);
//			Method[] methods=Add.class.getDeclaredMethods();
//			Set<String> set=new HashSet<>();
//			boolean overload=false;
//			for(int i=0;i<methods.length;i++)
//			{
//				if(set.contains(methods[i].getName()))
//				{
////					overload=true;
//					break;
//				}
//				set.add(methods[i].getName());
//				
//			}
//			if(overload)
//			{
//				throw new Exception("Overloading not allowed");
//			}
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//                        }



// String a=in.nextLine();
// String a1[]=a.split("  ");
//      System.out.println(Integer.parseInt(a1[0]));
//      System.out.println(Integer.parseInt(a1[1]));
     
//        String s = "HelloWorld";
//       StringBuffer s1=new StringBuffer(s);
//       s=(s.substring(0,3));
//        StringBuffer s2=new StringBuffer(s);
//       System.out.println(s1.replace(0,3,s2.reverse().toString()).toString());



//Scanner in = new Scannner(System.in);
//        BigInteger A = new BigInteger(in.next());
//        BigInteger B = new BigInteger(in.next());
//
//        System.out.println(A.add(B));


Printer myPrinter = new Printer();
//Printer<Integer> myPrinter1 = new Printer<Integer>();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);




  }
    }


class Printer<DT>
{
   //Write your code here
   public void printArray(DT[] arr){
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
   }
 
}
class Add{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(int a,int b,int c,int d,int e){
        System.out.println(a+b+c+d+e);
    }
    void add(int a,int b,int c,int d,int e,int f){
        System.out.println(a+b+c+d+e+f);
    }
    
}
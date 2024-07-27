
package huffmanalgorithm;


public class DecodeEncode
{
    
    // O(n)
   String decodeThroughRoot(BSTNode root,String s){
       BSTNode temp=root;
       String decode="";
       for (int i = 0; i < s.length(); i++)
       {
           if(temp.left==null&&temp.right==null){
//            System.out.println(temp.data);
            decode+=temp.data;
            temp=root;
            i--;
           }
           else if(Character.toString(s.charAt(i)).equals("0")){
//               System.out.println("left");
               temp=temp.left;
           }
           else if(Character.toString(s.charAt(i)).equals("1")){
//               System.out.println("right");
               temp=temp.right;
           }
       }
       // attach the last element that cant attach using loop
       decode+=temp.data;
//       System.out.println(t +" is");
       return decode;
   }
   // O(n.m) n=length of encodedatainput m=length of chart 
   String decodeThroughChart(String [][]chart,String s){
       String decode="",t="";
       for (int i = 0; i < s.length(); i++)
       {
           t+=s.charAt(i);
           for (int j = 0; j < chart.length; j++)
           {
               if(t.equals(chart[j][2])){
                   decode+=chart[j][0];
                   t="";
               }
           }
       }
       return decode;
   }
   // o(n.m)
   String encodeThroughChart(String [][] chart ,String s){
       String encode="";
       for (int i = 0; i < s.length(); i++)
       {
           for (int j = 0; j < chart.length; j++)
           {
               if(Character.toString(s.charAt(i)).equals(chart[j][0])){
                   encode+=chart[j][2];
               }
           }
       }
       return encode;
   }
   
   String encodeThroughRoot(BSTNode root,String s){
       String encode="";
       for (int i = 0; i < s.length(); i++)
       {
           encode+=rec(root,s.charAt(i),"");
       }
       
       
       return encode;
   }
    private String rec(BSTNode root,char c,String s) {
//               System.out.println("data "+root.data+" freq "+root.freq);
//               System.out.println("root "+root.data+" character "+c);
//               System.out.println((root.data==c));
               if(root.data==c){  
//                  System.out.println(c + " mil gya");
               return s;
              }
               else if(root.left==null&&root.right==null){
//                   System.out.println("ne mila wapis");
                  return "";
              } 
              else{
                 String s1= rec(root.left,c,s+"0");
                  String s2=rec(root.right,c,s+"1");
                  if(!s1.equals(""))
                      return s1;
                  else if(!s2.equals(""))
                      return s2;
                  else 
                      return "";
              }
                  
          }
   
}

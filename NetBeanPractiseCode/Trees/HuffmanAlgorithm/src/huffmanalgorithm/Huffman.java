
package huffmanalgorithm;

public class Huffman
{
    private String[][] ch;
    private int size;
    
    
    BSTNode generateHuffmanTree(PiorityQueue pq){
        ch=new String [pq.size][3];
        size=0;
        while(pq.size>1){
//            System.out.println("size of pq"+pq.size);
            BSTNode left=pq.deletion();
            BSTNode right=pq.deletion();
//            System.out.println("left is "+left.data+" with freq "+left.freq+" right is "+right.data+" with freq "+right.freq);
//            System.out.println("sum of freq "+(left.freq+right.freq));
            BSTNode n=new BSTNode((left.freq+right.freq),left,right);
            pq.insertion(n);
        }
        generatechart(pq.arr[1],"");
           return pq.deletion();
    }
    String[][] getChart(){
        return ch;
    }
    void generatechart(BSTNode root,String s){
        if(root.left==null&&root.right==null){
            ch[size][0]=Character.toString(root.data);
            ch[size][1]=Integer.toString(root.freq);
            ch[size][2]=s;
            size++;
//            System.out.println(root.data+" "+root.freq+"  "+s);
        }
        else{
//            System.out.println("chart "+root.data+" freq "+root.freq);
            generatechart(root.left,s+"0");
            generatechart(root.right,s+"1");
            
        }
    }
    void printChart(String [][] ch){
        for (int i = 0; i < ch.length; i++)
        {
            for (int j = 0; j < ch[i].length; j++)
            {
                System.out.print(ch[i][j]+ "  ");
            }
            System.out.println("");
        }
    }
    void CalculateInfo(String [][] ch){
        int orignalBits=sumFreq(ch)*8;
        int compressBits=saveBit(ch);        
        System.out.println("Toatal bits of Orignal String : "+orignalBits);
        System.out.println("Total bits After Compression : "+compressBits);
        System.out.println("Bits you save :" +(orignalBits-compressBits));
        float percentage=((orignalBits-compressBits)*100)/(float)orignalBits;
        System.out.println("You saved "+percentage +"% bits ");
        
    }
    
    private int saveBit(String [][]ch){
        int sum=0;
        for (int i = 0; i < ch.length; i++)
        {
            sum+=(Integer.parseInt(ch[i][1])*ch[i][2].length());
        }
        return sum;
    }
    private int sumFreq(String [][] ch){
        int sum=0;
        for (int i = 0; i < ch.length; i++)
        {
            sum+=Integer.parseInt(ch[i][1]);
        }
        return sum;
    }
}

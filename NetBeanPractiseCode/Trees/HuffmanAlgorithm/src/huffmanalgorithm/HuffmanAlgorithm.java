
package huffmanalgorithm;


public class HuffmanAlgorithm
{
     static PiorityQueue  pq;
   
    public static void main(String[] args)
    {
        // TODO code application logic here
//        String in = "SAAMOSSA RAKORA";
        String in="ABBRRA CAADDABRA";
        PiorityQueue pq=new PiorityQueue();
        Huffman h = new Huffman();
        DecodeEncode de = new DecodeEncode();
        pq.generatePQ(in);
        BSTNode Huffmanroot =h.generateHuffmanTree(pq);
        String [][] ch =h.getChart();
        h.printChart(ch);
        System.out.println(de.decodeThroughRoot(Huffmanroot, "00101100100110111101100101"));
//        System.out.println(de.decodeThroughChart(ch, "00101100100110111101100101"));
        System.out.println(de.encodeThroughChart(ch, "SORRAMORO")); 
//        System.out.println(de.encodeThroughRoot(Huffmanroot, "SORRAMORO"));
        h.CalculateInfo(ch);
        
        
        
        
        
        
        
       
        
        
        
      
    }
}

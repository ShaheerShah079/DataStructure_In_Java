package huffmancodinglabterminal;

public class EncodeDecode {
         
    public String decodeData(Node root, String data) {
        Node p = root;
        String s = "";
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '1')
                p = p.right;
            else if (data.charAt(i) == '0')
                p = p.left;
            // is leaf, if leaf then print it
            if (p.left == null && p.right == null) {
                s = s + p.data;
                p = root;
            }
        }
        return s;
    }
    public String decodeData(String data) {
       String chart[][]=Huffman.storeArray;
        String decodeData="";
        String match="";
        for (int i = 1; i < data.length(); i++) {
            match = match + data.charAt(i);
            for (int j = 0; j < chart.length; j++) {
               if(match.equals(chart[j][2])){
                   decodeData=decodeData+chart[j][0];
                   match="";
                   break;
               } 
            }
        }
        return decodeData;
    }
    public String encodeData(String data) {
        String chart[][]=Huffman.storeArray;
        String encodeData="1";
        
        for (int i = 0; i < data.length(); i++) {
            for (int j = 0; j < chart.length; j++) {
               if(Character.toString(data.charAt(i)).equals(chart[j][0])){
                   encodeData=encodeData+chart[j][2];
                   break;
               } 
            }
        }
        return encodeData;
    }
}

package huffmancodinglabterminal;

public class Huffman {
    public static int i = 0;
    public static String[][] storeArray;
    static CharacterFrequencyChart chart = new CharacterFrequencyChart();
    
    public Node generateHuffmanTree(PQueue pq) {
        while (pq.length() > 1) {
            Node left = pq.removeMin();
            Node right = pq.removeMin();
            Node n = new Node(left.freq + right.freq, left, right);
            pq.insert(n);
        }
        return pq.removeMin();
    }
    
    public void storeHuffmanTree(Node root, String s, String[][] arr) {
        if (root.left == null && root.right == null) {

            storeArray[i][0] = root.data + "";
            storeArray[i][1] = Integer.toString(root.freq);
            storeArray[i][2] = s;
            i++;

            return;
        }
        storeHuffmanTree(root.left, s + "0", arr);
        storeHuffmanTree(root.right, s + "1", arr);
    }

    public void displayArray(String[][] arr) {
        System.out.println("Char | \tFreq | \t Code");
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < 3; k++)
                System.out.print(arr[j][k] + "    |\t");
            System.out.println("\b\b");

        }
    }

}
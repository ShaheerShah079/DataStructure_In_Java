
package expressiontreealgorithm;

/**
 *
 * @author Personal's PC
 */
public class Node
{
     char data;
    Node left;
    Node right;
    Node(char d)
    {
        data =d;
        left = null;
        right=null;
    }
    
    Node(char d,Node l , Node r)
    {
        data =d;
        left = l;
        right=r;
    }  
}

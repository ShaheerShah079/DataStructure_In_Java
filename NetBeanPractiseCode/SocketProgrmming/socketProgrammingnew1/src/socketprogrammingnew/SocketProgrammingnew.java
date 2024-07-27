
package socketprogrammingnew;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketProgrammingnew{
  
    public static void main(String[] args) throws IOException
    {
        
        SocketProgrammingnew.Recieve ob1 = ob.new Recieve();
        ob1.start();
        try{
        Socket s = new Socket("127.0.0.1", 1256);
        ObjectOutputStream outObj = new ObjectOutputStream(s.getOutputStream());
        String [][] str2= {{"S","00"},{"A","11"},{"M","100"}};
        BigInteger big =new BigInteger("101010101010101010101010101");
        outObj.writeObject(str2);
        outObj.writeObject(big);
          outObj.close();
          s.close();
        }
        catch (Exception ex)
        {
          ex.getMessage();
          System.out.println("error sender");
        }
            System.out.println("Succesfully send");
    }
class Recieve extends Thread
{

    ServerSocket ss;

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                this.ss = new ServerSocket(1256);
                Socket s = ss.accept(); 
                ObjectInputStream inObj = new ObjectInputStream(s.getInputStream());
                String [][]str2 = (String[][])inObj.readObject();
                BigInteger bigin = (BigInteger)inObj.readObject();
                for (int i = 0; i < str2.length; i++)
                {
                    for (int j = 0; j < str2[i].length; j++)
                    {
                        System.out.print(str2[i][j]+"  ");
                    }
                System.out.println("");
                }
                System.out.println(bigin.bitCount());
                 inObj.close(); 
                s.close();
                ss.close();
            } catch (IOException ex)
            {
                ex.getMessage();
            }
            catch (ClassNotFoundException ex)
            {
                Logger.getLogger(Recieve.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

}
}
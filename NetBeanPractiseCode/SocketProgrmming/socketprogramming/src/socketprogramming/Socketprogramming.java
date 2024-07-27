/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogramming;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Socketprogramming
{

    public static void main(String[] args) throws IOException
    {
//        Recieve ob = new Recieve();
//        ob.start();
        Socket s = new Socket("127.0.0.1", 1256);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        String str = "asdfdf";
        out.writeUTF(str);
        out.close();
        s.close();
    }

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
                DataInputStream in = new DataInputStream(s.getInputStream());
                String str = in.readUTF();
                System.out.println(str);
                in.close();
                s.close();
            } catch (IOException ex)
            {
            }
        }
        
    }

}


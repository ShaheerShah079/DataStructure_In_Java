package labmidquestion3;

import java.util.Scanner;

public class LabMidQuestion3
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Node head=null,n,tail=null,temp;
        int sum=0,nodeNum,data1,data2,data3;
        System.out.println("Enter Number of nodes");
        nodeNum=in.nextInt();
        for (int i = 1; i <=nodeNum; i++)
        {
            System.out.println("Enter three values of Node "+i);
            data1=in.nextInt();
            data2=in.nextInt();
            data3=in.nextInt();
            n=new Node(data1,data2,data3);
            if(i==1){
                head=n;
                tail=n;
            }
            else{
                tail.next=n;
                tail=n;
            }
        }
        temp=head;
        for (int i = 1; i <=nodeNum; i++){
            sum=sum+temp.data1+temp.data2+temp.data3;
            temp=temp.next;
        }
        
        System.out.println("Sum values in each nodes : "+sum);
        
    }
}

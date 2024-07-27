package staticstackmain;

import java.util.Scanner;

public class StaticStackMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StaticStack<Integer> l = new StaticStack<>(10);
        int choice;
        char check;
        do{
        System.out.println("Stack Operations\n    1. Push\n    2. Pop\n    3. Length\n    4. Clear\n    5. Display");
            System.out.print("Enter Your choice : ");
        choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter a number to push : ");
                l.push(in.nextInt());
                System.out.println("Number inserted");
                break;
            case 2:
                System.out.println("Pop element " + l.pop());
                break;
            case 3:
                System.out.println("Length of stack is " + l.length());
                break;
            case 4:
                System.out.println("List clear...");
                l.clear();
                break;
            case 5:
                l.display();
                break;
            default:
                System.out.println("Enter correct choice");
        }
            System.out.print("Do you want to continue (Type y or n) : ");
        check = in.next().charAt(0);
    }while(check=='y');
    }
}

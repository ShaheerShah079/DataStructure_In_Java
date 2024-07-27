package com.shaheer;

import java.util.Scanner;

public class StackNotation {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       DynamicStack<Integer> l = new DynamicStack<>();
        System.out.println("Enter the infix notation");
        String infix = in.next();
        String postfix =infixToPostfix(infix);
        for (int i = 0; i < postfix.length(); i++) {
            if(postfix.charAt(i)>'0'&&postfix.charAt(i)<='9') {
                l.push(Integer.parseInt(String.valueOf(postfix.charAt(i))));
            }
            else{
                int op2=l.pop();
                int op1=l.pop();
                switch (postfix.charAt(i)){
                    case '+':
                        l.push((op1+op2));
                        break;
                    case '-':
                        l.push((op1-op2));
                        break;
                    case '*':
                        l.push((op1*op2));
                        break;
                    case '/':
                        l.push((op1/op2));
                        break;
                    case '^':
                        l.push((int)(Math.pow(op1,op2)));
                        break;
                }
            }
        }

        System.out.println("The result is "+l.pop());
    }
   static String infixToPostfix(String input){
        String postfix="";
        DynamicStack<Character> l = new DynamicStack<>();
        for (int i = 0; i < input.length(); i++) {
            char e=input.charAt(i);
            if(e>='0'&&e<='9'){
                postfix=postfix+e;
            }
            else{
                while(!l.isEmpty()&&precedence(l.peek(),e)){
                    postfix=postfix+l.pop();
                }
                l.push(e);
            }

        }
        while(!l.isEmpty()){
            postfix=postfix+l.pop();
        }

        return postfix;
    }

    static boolean precedence(char a,char b){
        if(a=='^') return true;
        else if(a=='/'&&(b!='^'&&b!='*')) return true;
        else if(a=='*'&&(b!='/'&&b!='^')) return true;
        else if(a=='+'&&b=='-') return true;
        else if(a=='-'&&b=='+') return true;
        else return false;
    }

}




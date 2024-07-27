package com.shaheer;

import java.util.Scanner;

public class convertingInfixtoPostfix {
    public static void main(String[] args) {
        // check precedense of operator
//      System.out.println("^,/"+pred('^','/'));
//        System.out.println("^,*"+pred('^','*'));
//        System.out.println("^,+"+pred('^','+'));
//        System.out.println("^,-"+pred('^','-'));
//
//        System.out.println("/,^"+pred('/','^'));
//        System.out.println("/,*"+pred('/','*'));
//        System.out.println("/,+"+pred('/','+'));
//        System.out.println("/,_"+pred('/','-'));
//
//        System.out.println("*,^"+pred('*','^'));
//        System.out.println("*,/"+pred('*','/'));
//        System.out.println("*,+"+pred('*','+'));
//        System.out.println("*,-"+pred('*','-'));
//
//        System.out.println("+,^"+pred('+','^'));
//        System.out.println("+,/"+pred('+','/'));
//        System.out.println("+,*"+pred('+','*'));
//        System.out.println("+,-"+pred('+','-'));
//
//        System.out.println("-,^"+pred('-','^'));
//        System.out.println("-,/"+pred('-','/'));
//        System.out.println("-,*"+pred('-','*'));
//        System.out.println("-,+"+pred('-','+'));

        Scanner in = new Scanner(System.in);
        String input,postfix="";
        System.out.println("Enter infix notation");
        input=in.next();
        DynamicStack<Character> l = new DynamicStack<>();
        for (int i = 0; i < input.length(); i++) {
            char e=input.charAt(i);
            if(e>='A'&&e<='Z'){
            postfix=postfix+e;
            }
            else{
             while(!l.isEmpty()&&pred(l.peek(),e)){
                 postfix=postfix+l.pop();
             }
             l.push(e);
            }

        }
        while(!l.isEmpty()){
            postfix=postfix+l.pop();
        }

        System.out.println(postfix);

    }

    static boolean pred(char a,char b){
        if(a=='^') return true;
        else if(a=='/'&&b!='^') return true;
        else if(a=='*'&&(b!='/'&&b!='^')) return true;
        else if(a=='+'&&b=='-') return true;
        else return false;
    }

}

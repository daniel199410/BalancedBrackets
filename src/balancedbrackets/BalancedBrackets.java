/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancedbrackets;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Luis Angel
 */
public class BalancedBrackets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Arroz".charAt(0)=='A');
    } 

    public static String isBalanced(String s) {   
        if(!s.isEmpty()){
            Stack<String> pila = new Stack();
            int i = 0;
            while(i < s.length()){
                switch (s.charAt(i)) {
                    case '(':
                        pila.push("(");
                        break;
                    case '{':
                        pila.push("{");
                        break;
                    case '[':
                        pila.push("[");
                        break;
                    case ')':
                        if(pila.peek().equals("(")){
                            pila.pop();
                        }else{
                            return "NO";
                        }   break;
                    case '}':
                        if(pila.peek().equals("{")){
                            pila.pop();
                        }else{
                            return "NO";
                        }   break;
                    case ']':
                        if(pila.peek().equals("[")){
                            pila.pop();
                        }else{    
                            return "NO";
                        }   break;
                    default:
                        break;
                }
                i++;
            }
            if(pila.isEmpty()){
                return "YES";
            }
        }
        return "NO";
    }
}
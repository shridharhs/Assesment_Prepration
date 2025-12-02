
import java.util.*;
public class balanced_parentheses {
    public static void main(String[] args){
        String s="(())()";
        Stack<Character> st=new Stack<>();
        boolean ok=true;
        for(char c:s.toCharArray()){
            if(c=='(') st.push(c);
            else{
                if(st.isEmpty()){ ok=false; break; }
                st.pop();
            }
        }
        if(!st.isEmpty()) ok=false;
        System.out.println(ok?"Balanced":"Not");
    }
}
/* 22nd prg
  This program checks if the parentheses in a string are BALANCED.

  Balanced means:
      Every '(' has a matching ')'
      in the correct order.

  Example:
      "(())()" is balanced
      "(()" is NOT balanced
      "())(" is NOT balanced

  Our string is:
      "(())()"

  To solve this, we use a STACK.
  Think of a stack like a pile of plates:
      You add on top (push)
      You remove from top (pop)

  RULES:
      When we see '('  → push it onto the stack
      When we see ')'  → pop from the stack
      If we try to pop when the stack is empty → NOT balanced

  Step-by-step:

  Start:
      st = empty stack

  Read characters one by one:

      '(' → push → stack: (
      '(' → push → stack: ( (
      ')' → pop  → stack: (
      ')' → pop  → stack: (empty)
      '(' → push → stack: (
      ')' → pop  → stack: (empty)

  Step 2:
  After reading all characters:
      If the stack is empty → balanced
      If something is left → not balanced

  Our stack is empty → everything matched correctly.

  Step 3:
  Print result:
      "Balanced"

  Final Answer:
      The parentheses are balanced.
*/

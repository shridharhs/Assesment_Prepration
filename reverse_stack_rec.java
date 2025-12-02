
import java.util.*;
public class reverse_stack_rec {
    static void insertBottom(Stack<Integer> s,int x){
        if(s.isEmpty()){ s.push(x); return; }
        int t=s.pop();
        insertBottom(s,x);
        s.push(t);
    }
    static void reverse(Stack<Integer> s){
        if(s.isEmpty()) return;
        int t=s.pop();
        reverse(s);
        insertBottom(s,t);
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(1); s.push(2); s.push(3);
        reverse(s);
        System.out.println(s);
    }
}
/* 23rd prg
  This program REVERSES a STACK using RECURSION.

  First, what is a stack?
      A stack is like a pile of books:
          - You put a book on TOP → push()
          - You take a book from TOP → pop()

  Our stack (top at the right side):
      [1, 2, 3]
               ↑ top

  We want to reverse it to:
      [3, 2, 1]

  But the RULE of a stack is:
      You cannot directly reach the bottom.
      You can ONLY remove the top item.

  So we use RECURSION — a trick where the function calls itself.

  There are TWO main functions:

  --------------------------------------------------------
  1) reverse(stack)
  --------------------------------------------------------
      This removes the TOP item,
      reverses the remaining stack,
      and then places the removed item at the BOTTOM.

      Steps:
          pop → reverse → insert at bottom

      Example:
          pop 3 → reverse [1, 2]
          pop 2 → reverse [1]
          pop 1 → reverse []
          Now insert back at bottom:
              insert 1 → stack: [1]
              insert 2 → stack: [1, 2]
              insert 3 → stack: [1, 2, 3]
  --------------------------------------------------------

  --------------------------------------------------------
  2) insertBottom(stack, x)
  --------------------------------------------------------
      This places a number at the BOTTOM of the stack.

      How?
          If stack is empty → just push it.
          Else:
              pop the top,
              call insertBottom again,
              then push the popped item back.

      This method lets us reach the BOTTOM using recursion.
  --------------------------------------------------------

  Let's walk through reversing [1, 2, 3]:

      reverse([1,2,3]):
          pop 3
          reverse([1,2]):
              pop 2
              reverse([1]):
                  pop 1
                  reverse([]):
                      empty → return
                  insertBottom(1) → [1]
              insertBottom(2) → [1,2]
          insertBottom(3) → [1,2,3]

  Now the stack becomes:
      [3, 2, 1]

  Finally we print it.

  Final Answer:
      The stack is reversed: [3, 2, 1]
*/

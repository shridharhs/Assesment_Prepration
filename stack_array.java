
public class stack_array{
    static int top=-1;
    static int[] s=new int[5];
    static void push(int x){ s[++top]=x; }
    static int pop(){ return s[top--]; }
    public static void main(String[] args){
        push(10); push(20);
        System.out.println(pop());
    }
}
/* 21st prg
  This program CHECKS if a linked list has a CYCLE (a loop).

  What is a cycle?
      A cycle means the list does NOT end.
      Instead of ending with null,
      a node points back to a previous node.

  Example of a cycle:
      [1] → [2] 
            ↑   |
            |   ↓
            └────

  In our code:
      h = 1
      h.next = 2
      h.next.next = h   (2 points back to 1)
      So the list becomes a loop.

  To detect a cycle, we use TWO pointers:
      s = slow pointer  (moves 1 step)
      f = fast pointer  (moves 2 steps)

  How the trick works:
      If the list has a loop,
      fast will eventually meet slow.
      (They will be at the same node.)

  Step-by-step:

  Start:
      s = node 1
      f = node 1

  Round 1:
      s = s.next       → node 2
      f = f.next.next  → goes 1 → 2 → then loops back to 1

  Round 2:
      s = node 1 (because 2 → 1)
      f = node 2 (because 1 → 2 → 1 → 2 faster)

  They keep looping inside the cycle.

  Very soon:
      s == f   → both meet inside the loop

  When this happens:
      cyc = true

  Step 3:
  Print result:
      "Cycle"

  Final Result:
      The linked list contains a loop.
*/

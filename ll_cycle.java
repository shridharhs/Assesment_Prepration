
class Node{ int data; Node next; Node(int d){data=d;} }
public class ll_cycle{
    public static void main(String[] args){
        Node h=new Node(1);
        h.next=new Node(2);
        h.next.next=h;
        Node s=h,f=h;
        boolean cyc=false;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){cyc=true;break;}
        }
        System.out.println(cyc?"Cycle":"No Cycle");
    }
}
/* 20th prg
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

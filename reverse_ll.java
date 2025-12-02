
class Node{ int data; Node next; Node(int d){data=d;} }
public class reverse_ll{
    public static void main(String[] args){
        Node h=new Node(1);
        h.next=new Node(2);
        h.next.next=new Node(3);
        Node p=null,c=h,n=null;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        while(p!=null){ System.out.print(p.data+" "); p=p.next; }
    }
}
/* 18th prg
  This program REVERSES a linked list.

  First, what does a linked list look like?
      [1] → [2] → [3] → null
      (h points to the first node)

  We want to flip it so it becomes:
      [3] → [2] → [1] → null

  To reverse a linked list, we use THREE pointers:
      p = previous node      (starts as null)
      c = current node       (starts as head)
      n = next node          (temporary helper)

  Step-by-step:

  Start:
      p = null
      c = node 1
      n = null

  Round 1:
      n = c.next      → n = node 2
      c.next = p      → 1 points to null
      p = c           → p = node 1
      c = n           → c = node 2

      List looks like this now:
          [1] → null
          [2] → [3] → null   (still normal)

  Round 2:
      n = c.next      → node 3
      c.next = p      → 2 points to 1
      p = c           → p = node 2
      c = n           → c = node 3

      List now:
          [2] → [1] → null
          [3] → null

  Round 3:
      n = c.next      → null
      c.next = p      → 3 points to 2
      p = c           → p = node 3
      c = n           → c = null (loop ends)

  Now the list is fully reversed:
      [3] → [2] → [1] → null

  Finally:
      Print the reversed list:
          3 2 1

  Final Result:
      The linked list has been reversed successfully.
*/

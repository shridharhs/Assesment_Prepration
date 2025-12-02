
class Node{ int data; Node next; Node(int d){data=d;} }
public class ll_insert_end {
    public static void main(String[] args){
        Node h=new Node(1);
        h.next=new Node(2);
        Node t=h;
        while(t.next!=null) t=t.next;
        t.next=new Node(3);
        t=h;
        while(t!=null){ System.out.print(t.data+" "); t=t.next; }
    }
}
/* 17th prg
  This program INSERTS a new node at the END of a linked list.

  First, understand the linked list:
      Each node has:
          data → the number it stores
          next → the link to the next node

  Step 1:
  We start with a small linked list:
      [1] → [2] → null

      h = head of the list (value 1)
      h.next = node with value 2

  Step 2:
  We want to ADD a new node with value 3 at the END.

  Step 3:
  To find the end, we use a pointer t:
      t = h (start at the first node)

  Step 4:
  Move t forward until it reaches the LAST node.

      t = node 1 → not last (next exists)
      t = node 2 → last node (next is null)

  Step 5:
  Attach the new node at the end:

      t.next = new Node(3)

      Now the list becomes:
          [1] → [2] → [3] → null

  Step 6:
  Print the entire list:
      1 2 3

  Final Result:
      The new node (3) is successfully added at the END.
*/

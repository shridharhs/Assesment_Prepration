
class Node{ int data; Node next; Node(int d){data=d;} }
public class ll_insert_begin {
    public static void main(String[] args){
        Node h=null;
        Node n=new Node(10);
        n.next=h;
        h=n;
        System.out.println(h.data);
    }
}
/* 16th prg
  This program INSERTS a new node at the BEGINNING of a linked list.

  First, what is a linked list?
      It is like a chain of boxes.
      Each box stores:
          - a number (data)
          - the address of the next box (next)

  Step 1:
  At the start, our list is empty:
      h = null
      (There is no first node.)

  Step 2:
  We create a new node:
      n = new Node(10)

      This node has:
          data = 10
          next = null  (for now)

  Step 3:
  To insert at the BEGINNING:
      We make the new node point to the OLD head.

      n.next = h
      Since h was null:
          n.next = null

  Step 4:
  Now we make the new node the NEW HEAD:
      h = n

      So the list looks like:
          [10] → null

  Step 5:
  Print the data of the head:
      Output = 10

  Final result:
      The linked list now starts with the value 10.
*/

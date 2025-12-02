
class Node{ int data; Node next; Node(int d){data=d;} }
public class ll_middle {
    public static void main(String[] args){
        Node h=new Node(1);
        h.next=new Node(2);
        h.next.next=new Node(3);
        Node s=h,f=h;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        System.out.println(s.data);
    }
}
/* 19th prg
  This program finds the MIDDLE node of a linked list.

  Our linked list is:
      [1] → [2] → [3] → null

  We use TWO pointers:
      s = slow pointer
      f = fast pointer

  How they move:
      slow moves ONE step at a time
      fast moves TWO steps at a time

  Why does this work?
      Because when fast reaches the END,
      slow will be exactly in the MIDDLE.

  Step-by-step:

  Start:
      s = node 1
      f = node 1

  Round 1:
      s = s.next       → node 2
      f = f.next.next  → node 3

  Next round check:
      f is at node 3
      f.next is null
      So the loop stops.

  Now:
      slow pointer (s) is at node 2
      which is the MIDDLE of the list.

  Step 3:
  Print the middle element:
      Output = 2

  Final Result:
      The middle of the linked list is 2.
*/

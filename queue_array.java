
public class queue_array{
    static int[] q=new int[5];
    static int f=0,r=0;
    static void enq(int x){ q[r++]=x; }
    static int deq(){ return q[f++]; }
    public static void main(String[] args){
        enq(10); enq(20);
        System.out.println(deq());
    }
}
/* 24th prg
  This program shows how a QUEUE works using an ARRAY.

  What is a queue?
      Think of people standing in a line.
      The person who comes FIRST will go FIRST.
      This is called FIFO → First In, First Out.

  We use:
      q[] → the array that stores the queue
      f   → front pointer (where we remove)
      r   → rear pointer  (where we add)

  Step 1: Initially
      f = 0
      r = 0
      queue is empty

  Step 2: enq(10)
      Place 10 at q[r] → q[0] = 10
      Increase rear     → r = 1

      Queue looks like:
          [10]

  Step 3: enq(20)
      Place 20 at q[r] → q[1] = 20
      Increase rear     → r = 2

      Queue looks like:
          [10, 20]

  Step 4: deq()
      Remove the FRONT element:
          x = q[f] → q[0] = 10
      Increase front:
          f = 1

      So the element removed is 10.

  Step 5:
      Print the removed element:
          Output = 10

  Final Result:
      The queue works like a real line:
          10 entered first → 10 came out first.
*/

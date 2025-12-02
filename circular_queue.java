
public class circular_queue {
    static int[] q=new int[5];
    static int f=0,r=0,count=0;
    static void enq(int x){
        if(count==5) return;
        q[r]=x; r=(r+1)%5; count++;
    }
    static int deq(){
        if(count==0) return -1;
        int t=q[f];
        f=(f+1)%5; count--;
        return t;
    }
    public static void main(String[] args){
        enq(1); enq(2); enq(3);
        System.out.println(deq());
    }
}
/* 25th prg
  This program shows how a CIRCULAR QUEUE works.

  What is a circular queue?
      Imagine 5 seats arranged in a circle.
      When you reach the last seat,
      you go back to the FIRST seat again.

  Why do this?
      So we don't waste empty spaces in the queue.

  Our queue details:
      q[]     → array of size 5
      f       → front pointer  (removal position)
      r       → rear pointer   (insertion position)
      count   → how many items are inside the queue

  The magic formula:
      (index + 1) % size
      This makes the pointer MOVE IN A CIRCLE.

  ------ ENQUEUE OPERATION (enq) ------
      Add an element at q[r]
      Move r forward in a circle:
          r = (r + 1) % 5
      Increase count

  ------ DEQUEUE OPERATION (deq) ------
      Take the element at q[f]
      Move f forward in a circle:
          f = (f + 1) % 5
      Decrease count

  Let's see what happens:

  Step 1: enq(1)
      q[0] = 1
      r = (0+1)%5 = 1
      count = 1

  Step 2: enq(2)
      q[1] = 2
      r = (1+1)%5 = 2
      count = 2

  Step 3: enq(3)
      q[2] = 3
      r = (2+1)%5 = 3
      count = 3

  Now the queue is:
      [1, 2, 3, -, -]
       ↑        ↑
       f=0      r=3

  Step 4: deq()
      Remove the element at q[f] = q[0] = 1
      f = (0+1)%5 = 1
      count = 2

      Removed value = 1

  Final Output:
      1

  Final understanding:
      A circular queue allows the front and rear to
      MOVE AROUND IN A LOOP using the % operator.
*/

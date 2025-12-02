
public class rotate_left {
    public static void main(String[] args){
        int[] a={1,2,3,4};
        int f=a[0];
        for(int i=0;i<a.length-1;i++) a[i]=a[i+1];
        a[a.length-1]=f;
        for(int x:a) System.out.print(x+" ");
    }
}
/* 9th program
  This program ROTATES the array to the LEFT by ONE position.

  Think of the array like:
      [1, 2, 3, 4]

  Left rotation means:
      The first number goes to the end,
      and everything else moves one step left.

  Step 1:
  Save the first element:
      f = 1

  Step 2:
  Shift all numbers one place to the left:

      Before: [1, 2, 3, 4]
      
      Move 2 to place of 1 → [2, 2, 3, 4]
      Move 3 to place of 2 → [2, 3, 3, 4]
      Move 4 to place of 3 → [2, 3, 4, 4]

  Step 3:
  Put the first number (1) at the end:
      [2, 3, 4, 1]

  Step 4:
  Print the final array.

  Final answer = 2 3 4 1
*/

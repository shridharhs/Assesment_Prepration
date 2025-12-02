
public class reverse_array {
    public static void main(String[] args){
        int[] a={1,2,3,4};
        for(int i=a.length-1;i>=0;i--) System.out.print(a[i]+" ");
    }
}

/* 3 Program
  This program prints the array in REVERSE order.

  Think of the array like a line of numbers standing in order:
      [1, 2, 3, 4]

  Normally we read from left to right.
  But here we want to read from RIGHT to LEFT.

  Step 1:
  The last number in the array is at position:
      a.length - 1
      (because arrays start at 0)

      For this array:
          length = 4
          last index = 3 (value = 4)

  Step 2:
  We start from the end and move backwards:
      Index 3 → number 4
      Index 2 → number 3
      Index 1 → number 2
      Index 0 → number 1

  Step 3:
  We print each number while going backwards.

  How it prints:
      4 3 2 1

  Final answer = 4 3 2 1
*/

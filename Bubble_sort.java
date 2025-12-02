/* 26th prg
  BUBBLE SORT

  What does Bubble Sort do?
      It sorts numbers from SMALL to BIG by comparing
      two numbers at a time and SWAPPING them
      if they are in the wrong order.

  Why is it called "Bubble" Sort?
      Because the biggest number slowly "bubbles" to the end
      of the list after each round.

  Example array:
      [5, 1, 4, 2]

  How Bubble Sort works (simple explanation):

  PASS 1:
      Compare 5 and 1 → swap → [1, 5, 4, 2]
      Compare 5 and 4 → swap → [1, 4, 5, 2]
      Compare 5 and 2 → swap → [1, 4, 2, 5]
      (Now 5 is in its correct position at the end)

  PASS 2:
      Compare 1 and 4 → OK
      Compare 4 and 2 → swap → [1, 2, 4, 5]

  PASS 3:
      Compare 1 and 2 → OK
      (Array is already sorted now)

  FINAL RESULT:
      [1, 2, 4, 5]

  Bubble Sort does this process using two loops:
      Outer loop   → number of passes
      Inner loop   → compares and swaps

  Time Complexity:
      Worst: O(n²)
      Best : O(n) (if already sorted with optimization)
*/

public class Bubble_sort {
    public static void main(String[] args){
        int[] a = {5, 1, 4, 2};

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                // If left number is bigger than right number → swap
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for(int x : a)
            System.out.print(x + " ");
    }
}

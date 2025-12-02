/* 
  SELECTION SORT

  What does Selection Sort do?
      It sorts numbers by SELECTING the SMALLEST number
      and putting it in the correct position.

  Think of it like:
      You look at all numbers,
      find the smallest one,
      and place it at the beginning.
      Then repeat for the rest.

  Example array:
      [5, 3, 1, 4]

  How Selection Sort works:

  PASS 1:
      Look at all numbers → smallest is 1
      Swap 1 with first element
      Array becomes: [1, 3, 5, 4]

  PASS 2:
      Now look at remaining part [3, 5, 4]
      Smallest is 3
      It's already in correct place
      Array: [1, 3, 5, 4]

  PASS 3:
      Look at [5, 4]
      Smallest is 4
      Swap 4 with 5
      Array becomes: [1, 3, 4, 5]

  FINAL RESULT:
      [1, 3, 4, 5]

  Why is it called "Selection" Sort?
      Because we SELECT the smallest each time.

  Time Complexity:
      O(n²) for all cases
*/

public class selection_sort {
    public static void main(String[] args){
        int[] a = {5, 3, 1, 4};

        for(int i = 0; i < a.length - 1; i++){
            int min = i; // assume current index is minimum

            // find smallest element in remaining array
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < a[min]){
                    min = j; // update index of smallest value
                }
            }

            // swap smallest with current position
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        // Print sorted array
        for(int x : a)
            System.out.print(x + " ");
    }
}

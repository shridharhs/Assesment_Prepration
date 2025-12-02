/* 30th  prg
  MERGE SORT

  What does Merge Sort do?
      It sorts an array by DIVIDING it into smaller parts,
      sorting those parts, and then MERGING them back together.

  Merge Sort uses the idea:
      "Break it into small pieces → sort → join again"

  It is a DIVIDE AND CONQUER algorithm.

  Example array:
      [5, 2, 4, 1]

  -------------------------------------------------------------
  HOW MERGE SORT WORKS:
  -------------------------------------------------------------

  1) DIVIDE:
      Break the array into 2 halves until each part has 1 element.

      [5, 2, 4, 1]
         /      \
     [5, 2]    [4, 1]
      /  \      /  \
    [5] [2]  [4] [1]

  2) CONQUER:
      Now merge the small pieces in sorted order.

      Merge [5] and [2] → [2, 5]
      Merge [4] and [1] → [1, 4]

  3) MERGE BIGGER PART:
      Merge [2, 5] and [1, 4]:

         Compare 2 and 1 → take 1
         Compare 2 and 4 → take 2
         Compare 5 and 4 → take 4
         Remaining → take 5

      Final result → [1, 2, 4, 5]

  -------------------------------------------------------------
  Why is merge sort fast?
      Because it cuts the array in half every time.
      Time complexity is O(n log n) — faster than bubble/selection/insertion.
  -------------------------------------------------------------

  Merge sort has two main functions:
      mergeSort() → divides the array
      merge()     → merges two sorted halves
*/

public class merge_sort {

    // Merge two sorted halves
    static void merge(int[] a, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data
        for(int i = 0; i < n1; i++) left[i] = a[l + i];
        for(int i = 0; i < n2; i++) right[i] = a[m + 1 + i];

        int i = 0, j = 0, k = l;

        // Merge the sorted halves
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        // Copy remaining elements
        while(i < n1) a[k++] = left[i++];
        while(j < n2) a[k++] = right[j++];
    }

    // Divide the array and sort
    static void mergeSort(int[] a, int l, int r){
        if(l < r){
            int m = (l + r) / 2;

            mergeSort(a, l, m);     // left half
            mergeSort(a, m + 1, r); // right half
            merge(a, l, m, r);      // merge
        }
    }

    public static void main(String[] args){
        int[] a = {5, 2, 4, 1};

        mergeSort(a, 0, a.length - 1);

        for(int x : a)
            System.out.print(x + " ");
    }
}

/* 28th prg
  INSERTION SORT

  What does Insertion Sort do?
      It builds the sorted array ONE number at a time,
      just like arranging playing cards in your hand.

  Imagine how people sort cards:
      - You pick a card
      - You compare it with the cards before it
      - You insert it in the correct place

  Example array:
      [5, 2, 4, 1]

  How Insertion Sort works:

  PASS 1: (Take 2)
      Compare 2 with 5 → 2 is smaller
      Insert 2 before 5
      Array becomes: [2, 5, 4, 1]

  PASS 2: (Take 4)
      Compare 4 with 5 → 4 is smaller → shift 5
      Compare 4 with 2 → 4 is bigger → stop
      Insert 4 after 2
      Array: [2, 4, 5, 1]

  PASS 3: (Take 1)
      Compare 1 with 5 → shift 5
      Compare 1 with 4 → shift 4
      Compare 1 with 2 → shift 2
      Insert 1 at the beginning
      Array: [1, 2, 4, 5]

  FINAL RESULT:
      [1, 2, 4, 5]

  Why is it called "Insertion" Sort?
      Because each element is INSERTED into its correct position.

  Time Complexity:
      Worst: O(n²)
      Best : O(n) if the list is already sorted
*/

public class insertion_sort {
    public static void main(String[] args){
        int[] a = {5, 2, 4, 1};

        for(int i = 1; i < a.length; i++){
            int key = a[i]; // the element we want to insert
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while(j >= 0 && a[j] > key){
                a[j + 1] = a[j];
                j--;
            }

            // Insert the key at the correct position
            a[j + 1] = key;
        }

        // Print the sorted array
        for(int x : a)
            System.out.print(x + " ");
    }
}

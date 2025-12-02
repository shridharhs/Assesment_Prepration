/* 29th prg
  BINARY SEARCH

  What does Binary Search do?
      It finds a number in a SORTED array
      by cutting the search space IN HALF each time.

  IMPORTANT:
      Binary Search works ONLY on sorted arrays.

  Example array:
      [1, 2, 3, 4, 5]

  We want to search for:
      key = 4

  How Binary Search works:

  Step 1:
      Set two pointers:
          l = 0        (left end)
          r = n - 1    (right end)

  Step 2:
      Find the MIDDLE position:
          m = (l + r) / 2

  Step 3:
      Compare:
          If a[m] == key → FOUND
          If key > a[m] → search RIGHT half
          If key < a[m] → search LEFT half

  Let's walk through searching for 4:

  Round 1:
      l = 0, r = 4
      m = 2
      a[m] = 3
      3 < 4 → go RIGHT
      So: l = m + 1 = 3

  Round 2:
      l = 3, r = 4
      m = (3 + 4) / 2 = 3
      a[m] = 4
      4 == key → FOUND!

  Final result:
      We found the key in the array.

  Time Complexity:
      O(log n) → very fast!
*/

public class Binary_search {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5};
        int key = 4;
        
        int l = 0, r = a.length - 1;
        boolean found = false;

        while(l <= r){
            int m = (l + r) / 2;

            if(a[m] == key){
                found = true;
                break;
            }
            else if(key > a[m]){
                l = m + 1; // move right
            }
            else{
                r = m - 1; // move left
            }
        }

        System.out.println(found ? "Found" : "Not Found");
    }
}


public class binary_search {
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        int key=4,l=0,r=a.length-1;
        boolean f=false;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==key){ f=true; break; }
            else if(key>a[m]) l=m+1;
            else r=m-1;
        }
        System.out.println(f?"Found":"Not Found");
    }
}

/* 7th program
  This program searches for a number using BINARY SEARCH.

  IMPORTANT:
  Binary search works ONLY on a SORTED array.

  Our array is sorted:
      [1, 2, 3, 4, 5]

  We want to find:
      key = 4

  Binary search is like finding a word in a dictionary:
      You don't check every page.
      You open the middle, decide left or right, and continue.

  Step 1:
  Set two pointers:
      l = 0  (left side)
      r = 4  (right side)

  Step 2:
  Find the MIDDLE:
      m = (l + r) / 2

  Round 1:
      l = 0, r = 4
      m = 2
      a[m] = 3

      Compare 3 with 4:
          3 < 4 → go RIGHT
      So we move left pointer:
          l = m + 1 = 3

  Round 2:
      l = 3, r = 4
      m = (3 + 4) / 2 = 3
      a[m] = 4

      Compare 4 with key 4:
          They are equal → FOUND!

  Step 3:
  Set f = true

  Step 4:
  Print the result:
      "Found"

  Final output = Found
*/

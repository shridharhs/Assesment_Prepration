
public class linear_search {
    public static void main(String[] args){
        int[] a={3,7,9,2};
        int key=9;
        boolean f=false;
        for(int x:a) if(x==key) f=true;
        System.out.println(f?"Found":"Not Found");
    }
}
/* 6th program
  This program SEARCHES for a number in the array using LINEAR SEARCH.

  Think of the array like a row of boxes:
      [3, 7, 9, 2]

  And we want to find the number:
      key = 9

  Linear search is very simple:
      We check each number one by one,
      from the first box to the last box.

  Step 1:
  Start at the beginning and compare:

      Box 1: 3  → not equal to 9
      Box 2: 7  → not equal to 9
      Box 3: 9  → YES, we found it!
      Box 4: (not needed, already found)

  Step 2:
  When we find the number, we set:
      f = true

  Step 3:
  Print the result:
      If f is true → print "Found"
      Else → print "Not Found"

  Final output = Found
*/

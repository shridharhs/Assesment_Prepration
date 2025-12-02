
import java.util.*;
public class remove_duplicates {
    public static void main(String[] args){
        int[] a={1,2,2,3,3,4};
        LinkedHashSet<Integer> s=new LinkedHashSet<>();
        for(int x:a) s.add(x);
        System.out.println(s);
    }
}
/* 4th program
  This program REMOVES DUPLICATE numbers from the array.

  Think of the array like this:
      [1, 2, 2, 3, 3, 4]

  You can see some numbers are repeated:
      2 appears twice
      3 appears twice

  Step 1:
  We use something called a "LinkedHashSet".

  What is a LinkedHashSet?
      - It stores only UNIQUE values
      - It does NOT allow duplicates
      - It keeps the order the same as the array

  Step 2:
  We go through each number in the array:
      If the number is NOT in the set → it gets added.
      If it is already inside → it gets ignored.

  Let's see what happens:

      Start: set = { }

      Read 1 → add it → {1}
      Read 2 → add it → {1, 2}
      Read 2 → already present → ignore
      Read 3 → add it → {1, 2, 3}
      Read 3 → already present → ignore
      Read 4 → add it → {1, 2, 3, 4}

  Step 3:
  Print the set.

  Final answer = {1, 2, 3, 4}
*/

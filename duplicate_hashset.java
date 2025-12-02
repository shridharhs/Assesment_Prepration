
import java.util.*;
public class duplicate_hashset {
    public static void main(String[] args){
        int[] a={1,2,3,2,4,1};
        HashSet<Integer> s=new HashSet<>();
        for(int x:a)
            if(!s.add(x)) System.out.println("Duplicate="+x);
    }
}
/* 40th prg
  FIND DUPLICATE NUMBERS USING HASHSET

  What does this program do?
      It finds which numbers appear MORE THAN ONCE in an array.

  Example array:
      [1, 2, 3, 2, 4, 1]

  Duplicates are:
      2 and 1

  --------------------------------------------------------
  Why use a HashSet?
      A HashSet stores ONLY UNIQUE values.

      VERY IMPORTANT RULE:
          add(x) returns true  → x was NOT present before
          add(x) returns false → x is a DUPLICATE

      So we don't need to manually check.
      The HashSet tells us automatically!

  --------------------------------------------------------
  Step-by-step explanation:

  Start with an empty HashSet:
      s = {}

  Read numbers one by one:

  Number 1:
      s.add(1) → true → added
      s = {1}

  Number 2:
      s.add(2) → true → added
      s = {1, 2}

  Number 3:
      s.add(3) → true → added
      s = {1, 2, 3}

  Number 2 again:
      s.add(2) → false → already exists
      PRINT → "Duplicate = 2"

  Number 4:
      s.add(4) → true → added
      s = {1, 2, 3, 4}

  Number 1 again:
      s.add(1) → false → duplicate
      PRINT → "Duplicate = 1"

  --------------------------------------------------------
  Final Output:
      Duplicate = 2
      Duplicate = 1

  HashSet makes duplicate detection VERY easy.
*/

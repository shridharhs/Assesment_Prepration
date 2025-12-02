
import java.util.*;
public class anagram {
    public static void main(String[] args){
        String a="listen",b="silent";
        char[] x=a.toCharArray(),y=b.toCharArray();
        Arrays.sort(x); Arrays.sort(y);
        System.out.println(Arrays.equals(x,y)?"Anagram":"Not");
    }
}
/* 14th prg
  This program checks if two words are ANAGRAMS.

  What is an anagram?
      Two words that have the SAME letters,
      but arranged in a DIFFERENT order.

  Example:
      "listen" and "silent"
      Both contain: l, i, s, t, e, n

  Step 1:
  Convert both words into character arrays:
      "listen" → [l, i, s, t, e, n]
      "silent" → [s, i, l, e, n, t]

  Step 2:
  Sort both arrays alphabetically:
      After sorting:
      [e, i, l, n, s, t]
      [e, i, l, n, s, t]

  Step 3:
  Compare the sorted arrays:
      If they are the same → the words are anagrams

  Step 4:
  Print the result:
      "Anagram"

  Final answer = Anagram
*/

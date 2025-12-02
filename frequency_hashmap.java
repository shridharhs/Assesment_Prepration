
import java.util.*;
public class frequency_hashmap {
    public static void main(String[] args){
        int[] a={1,2,2,3,3,3};
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int x:a) m.put(x,m.getOrDefault(x,0)+1);
        System.out.println(m);
    }
}
/* 39th prg 
  COUNT FREQUENCY OF NUMBERS USING HASHMAP

  What does this program do?
      It counts how many times each number appears in an array.

  Example array:
      [1, 2, 2, 3, 3, 3]

  We want to know:
      1 → appears 1 time
      2 → appears 2 times
      3 → appears 3 times

  --------------------------------------------------------
  Why use a HashMap?
      A HashMap stores data as KEY → VALUE pairs.

      Here:
          KEY   = the number
          VALUE = how many times it appears (frequency)

      Example:
          m.put(2, 5) means → number 2 appears 5 times
  --------------------------------------------------------

  Step-by-step explanation:

  Create an empty map:
      m = {}

  Loop through the array and update the frequency:

  Number 1:
      m.getOrDefault(1, 0) = 0 → add 1
      m = {1 = 1}

  Number 2:
      m.getOrDefault(2, 0) = 0 → add 2
      m = {1 = 1, 2 = 1}

  Number 2 again:
      m.getOrDefault(2, 0) = 1 → add 1 more
      m = {1 = 1, 2 = 2}

  Number 3:
      add 3 → m = {1 = 1, 2 = 2, 3 = 1}

  Number 3 again:
      increase count → m = {1 = 1, 2 = 2, 3 = 2}

  Number 3 again:
      increase count → m = {1 = 1, 2 = 2, 3 = 3}

  --------------------------------------------------------
  Final Result:
      {1=1, 2=2, 3=3}

  HashMap makes counting very easy and fast.
*/

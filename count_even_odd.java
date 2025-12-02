
public class count_even_odd {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6};
        int e=0,o=0;
        for(int x:a) if(x%2==0) e++; else o++;
        System.out.println("Even="+e+" Odd="+o);
    }
}

/* 10th prg
  This program COUNTS how many even and odd numbers are in the array.

  Our array is:
      [1, 2, 3, 4, 5, 6]

  Step 1:
  We create two counters:
      e = number of even numbers (starts at 0)
      o = number of odd numbers  (starts at 0)

  Step 2:
  We check each number one by one.

  A number is:
      EVEN → if x % 2 == 0
      ODD  → otherwise

  Let's go through the array:

      Number 1 → odd → o++
      Number 2 → even → e++
      Number 3 → odd → o++
      Number 4 → even → e++
      Number 5 → odd → o++
      Number 6 → even → e++

  Step 3:
  Now the counters are:
      e = 3 (2, 4, 6)
      o = 3 (1, 3, 5)

  Step 4:
  Print the result:
      Even = 3
      Odd  = 3

  Final output = Even = 3 Odd = 3
*/

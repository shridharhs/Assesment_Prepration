
public class rec_factorial {
    static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args){
        System.out.println(fact(5));
    }
}
/* 32nd prg
  RECURSIVE FACTORIAL

  What is factorial?
      The factorial of a number n (written as n!)
      means multiplying all whole numbers from n down to 1.

      Example:
          5! = 5 × 4 × 3 × 2 × 1 = 120

  This program calculates factorial using RECURSION.

  What is recursion?
      A function calling itself until it reaches a base case.

  Our function:
      fact(n):
          If n == 0 → return 1   (because 0! = 1)
          Else → return n × fact(n - 1)

  Let's see how fact(5) works step-by-step:

      fact(5)
       = 5 × fact(4)

      fact(4)
       = 4 × fact(3)

      fact(3)
       = 3 × fact(2)

      fact(2)
       = 2 × fact(1)

      fact(1)
       = 1 × fact(0)

      fact(0)
       = 1   (base case reached!)

  Now we multiply back:

      fact(1) = 1 × 1 = 1
      fact(2) = 2 × 1 = 2
      fact(3) = 3 × 2 = 6
      fact(4) = 4 × 6 = 24
      fact(5) = 5 × 24 = 120

  Final answer printed:
      120

  Recursion slowly breaks the problem down,
  then builds the answer by multiplying on the way back.
*/

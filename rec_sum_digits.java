
public class rec_sum_digits{
    static int sum(int n){
        if(n==0) return 0;
        return (n%10)+sum(n/10);
    }
    public static void main(String[] args){
        System.out.println(sum(1234));
    }
}
/* 33rd prg
  SUM OF DIGITS USING RECURSION

  What does this program do?
      It adds all the digits of a number using recursion.

  Example:
      n = 1234
      The digits are: 1, 2, 3, 4
      Their sum = 1 + 2 + 3 + 4 = 10

  How does recursion help?
      It breaks the number into:
          - The last digit   → n % 10
          - The remaining number → n / 10

  Our function:
      sum(n):
          If n == 0 → return 0
          Else → return (last digit) + sum(remaining digits)

  Let's see how sum(1234) works:

      sum(1234)
       = (1234 % 10) + sum(1234 / 10)
       = 4 + sum(123)

      sum(123)
       = 3 + sum(12)

      sum(12)
       = 2 + sum(1)

      sum(1)
       = 1 + sum(0)

      sum(0)
       = 0  (base case)

  Now adding all values:
      = 4 + 3 + 2 + 1 + 0
      = 10

  Final answer printed:
      10

  Recursion keeps peeling off the last digit
  until no digits are left.
*/

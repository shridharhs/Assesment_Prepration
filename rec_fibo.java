
public class rec_fibo {
    static int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        System.out.println(fib(6));
    }
}
/* 31st prg
  RECURSIVE FIBONACCI

  What is the Fibonacci series?
      It is a sequence of numbers where:
          F(0) = 0
          F(1) = 1
          F(n) = F(n-1) + F(n-2)

  So the series looks like:
      0, 1, 1, 2, 3, 5, 8, 13, ...

  This program calculates Fibonacci numbers using RECURSION.

  What is recursion?
      A function calling itself again and again
      until it reaches a stopping point (base case).

  Our function:
      fib(n):
          If n <= 1 → return n
          Else → return fib(n-1) + fib(n-2)

  Let's see how fib(6) works:

      fib(6)
       = fib(5) + fib(4)

      fib(5)
       = fib(4) + fib(3)

      fib(4)
       = fib(3) + fib(2)

      fib(3)
       = fib(2) + fib(1)

      fib(2)
       = fib(1) + fib(0)
       = 1 + 0 = 1

      fib(3)
       = fib(2) + fib(1)
       = 1 + 1 = 2

      fib(4)
       = 3

      fib(5)
       = 5

      fib(6)
       = 8

  So the final answer printed is:
      8

  Recursion repeatedly breaks the problem into
  smaller Fibonacci calls until the base cases (0 or 1).
*/

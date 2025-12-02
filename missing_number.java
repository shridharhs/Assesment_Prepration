
public class missing_number {
    public static void main(String[] args){
        int[] a={1,2,4,5};
        int n=5,sum=0;
        for(int x:a) sum+=x;
        int exp=n*(n+1)/2;
        System.out.println(exp-sum);
    }
}
/* 8th program
  This program finds the MISSING number from 1 to N.

  Think of the numbers from 1 to 5:
      1, 2, 3, 4, 5

  But our array has:
      [1, 2, 4, 5]

  The number 3 is missing.

  Instead of checking one by one,
  we use a smart math trick.

  Step 1:
  The sum of numbers from 1 to N is:
      N * (N + 1) / 2

  For N = 5:
      5 * 6 / 2 = 15

  This is the EXPECTED sum.

  Step 2:
  Now we add the numbers actually present in the array:
      1 + 2 + 4 + 5 = 12

  Step 3:
  Missing number = expected sum - actual sum
      15 - 12 = 3

  Step 4:
  Print the missing number.

  Final answer = 3
*/

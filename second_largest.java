
public class second_largest {
    public static void main(String[] args){
        int[] a={10,20,5,8};
        int max=Integer.MIN_VALUE, sec=Integer.MIN_VALUE;
        for(int x:a){
            if(x>max){ sec=max; max=x; }
            else if(x>sec && x!=max) sec=x;
        }
        System.out.println(sec);
    }
}

/* 2 program
  This program finds the SECOND BIGGEST number in the array.

  Think of an array like a list of numbers:
      {10, 20, 5, 8}

  Step 1:
  We create two boxes:
      max = smallest possible number
      sec = smallest possible number
  These will store:
      max → biggest number
      sec → second biggest number

  Step 2:
  We look at every number one by one.

  When we see a number bigger than max:
      The old max becomes sec
      The new number becomes max

  When we see a number that is:
      not the max AND
      bigger than sec
      → we update sec

  Let’s go through it:

      Number = 10
          10 > max → max = 10, sec = smallest

      Number = 20
          20 > 10 → sec = 10, max = 20

      Number = 5
          5 is not bigger than max or sec → ignore

      Number = 8
          8 > sec (10)? No → ignore

  Step 3:
  The second biggest number is sec = 10

  Final answer = 10
*/

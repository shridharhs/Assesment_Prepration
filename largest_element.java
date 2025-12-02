
public class largest_element {
    public static void main(String[] args){
        int[] a={3,9,1,7};
        int max=a[0];
        for(int x:a) if(x>max) max=x;
        System.out.println(max);
    }
}

/* 
1. Find the largest element in an array.

  This program finds the BIGGEST number in the array.

  Think of an array like a list of numbers:
      {3, 9, 1, 7}

  Step 1:
  We assume the first number is the biggest.
      max = 3

  Step 2:
  We look at every number one by one.
      Compare each number with max.

  Step 3:
  If we find a number bigger than max,
      we update max to that number.

  How it goes:
      Compare 3 with 3 → max = 3
      Compare 9 with 3 → 9 is bigger → max = 9
      Compare 1 with 9 → max stays 9
      Compare 7 with 9 → max stays 9

  Step 4:
  Print the biggest number.

  Final answer = 9
*/

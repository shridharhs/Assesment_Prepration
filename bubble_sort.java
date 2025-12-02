
public class bubble_sort {
    public static void main(String[] args){
        int[] a={5,1,4,2};
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a.length-i-1;j++)
                if(a[j]>a[j+1]){
                    int t=a[j]; a[j]=a[j+1]; a[j+1]=t;
                }
        for(int x:a) System.out.print(x+" ");
    }
}
/* 5th program
  This program sorts the array from SMALL to BIG using BUBBLE SORT.

  Think of bubble sort like this:
      You compare two numbers standing next to each other.
      If they are in the wrong order, you swap them.
      Just like bubbles rising to the top, the biggest number moves to the end.

  Our array:
      [5, 1, 4, 2]

  Step 1:
  Start comparing from the beginning.

  Pass 1:
      Compare 5 and 1 → wrong order → swap → [1, 5, 4, 2]
      Compare 5 and 4 → wrong order → swap → [1, 4, 5, 2]
      Compare 5 and 2 → wrong order → swap → [1, 4, 2, 5]
      (Now the biggest number 5 is at the end)

  Pass 2:
      Compare 1 and 4 → correct → no swap
      Compare 4 and 2 → wrong → swap → [1, 2, 4, 5]

  Pass 3:
      Compare 1 and 2 → correct
      (Everything is sorted now)

  Step 2:
  After all passes, the array becomes:
      [1, 2, 4, 5]

  Step 3:
  Print the sorted array.

  Final answer = 1 2 4 5
*/

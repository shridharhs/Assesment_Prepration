
class NodeB{ int data; NodeB left,right; NodeB(int d){data=d;} }
public class bst_search {
    static boolean search(NodeB r,int x){
        if(r==null) return false;
        if(r.data==x) return true;
        if(x<r.data) return search(r.left,x);
        return search(r.right,x);
    }
    public static void main(String[] args){
        NodeB r=new NodeB(10);
        r.left=new NodeB(5);
        r.right=new NodeB(15);
        System.out.println(search(r,15));
    }
}
/* 38th prg
  SEARCH IN A BINARY SEARCH TREE (BST)

  What is a BST?
      A Binary Search Tree keeps numbers in an ordered way:
          - Left subtree has SMALLER numbers
          - Right subtree has BIGGER numbers

  Example BST we created:

            10
           /  \
          5    15

  We want to search for:
      x = 15

  --------------------------------------------------------
  How BST search works:
  --------------------------------------------------------

  RULE:
      If x == current node → FOUND
      If x < current node  → search LEFT
      If x > current node  → search RIGHT

  This works because BST is sorted like a dictionary.

  Let's walk through searching for 15:

  Start at root = 10

  Step 1:
      Compare 15 with 10
      15 > 10 → go RIGHT

  Move to node = 15

  Step 2:
      Compare 15 with 15
      They are EQUAL → FOUND!

  Because recursion follows the BST rules,
  it reaches the correct place very quickly.

  --------------------------------------------------------
  Why is BST search fast?
      Because each step cuts the search space in half.
      Time complexity → O(log n)
  --------------------------------------------------------

  In main():
      search(r,15) returns TRUE

  Final Output:
      true
*/


class NodeBST{ int data; NodeBST left,right; NodeBST(int d){data=d;} }
public class bst_insert {
    static NodeBST insert(NodeBST r,int x){
        if(r==null) return new NodeBST(x);
        if(x<r.data) r.left=insert(r.left,x);
        else r.right=insert(r.right,x);
        return r;
    }
    public static void main(String[] args){
        NodeBST r=null;
        r=insert(r,50); insert(r,30); insert(r,70);
        System.out.println(r.data);
    }
}
/* 37th prg
  INSERT INTO A BINARY SEARCH TREE (BST)

  What is a BST?
      A Binary Search Tree is a special tree where:
          - Left side has SMALLER numbers
          - Right side has BIGGER numbers

      For any node:
          left < node < right

  We want to insert numbers into this BST:
      50, then 30, then 70

  --------------------------------------------------------
  How insertion works:
  --------------------------------------------------------

  RULE:
      If x < current node → go LEFT
      If x > current node → go RIGHT

  Step-by-step:

  1) Insert 50
      Tree is empty → 50 becomes the ROOT

            50

  2) Insert 30
      Compare with 50:
          30 < 50 → go LEFT
      LEFT is empty → place 30 here

            50
           /
         30

  3) Insert 70
      Compare with 50:
          70 > 50 → go RIGHT
      RIGHT is empty → place 70 here

            50
           / \
         30   70

  --------------------------------------------------------
  Why recursion works perfectly here?
      Each call handles one level of the tree,
      going left or right until it finds the correct empty spot.
  --------------------------------------------------------

  In main():
      r = insert(r, 50)
      insert(r, 30)
      insert(r, 70)

  The root node is 50, so:
      System.out.println(r.data) → prints 50

  FINAL RESULT:
      The BST is successfully built with root = 50.
*/

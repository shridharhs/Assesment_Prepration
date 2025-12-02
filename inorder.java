
class Node{ int data; Node left,right; Node(int d){data=d;} }
public class inorder {
    static void in(Node r){
        if(r==null)return;
        in(r.left); System.out.print(r.data+" "); in(r.right);
    }
    public static void main(String[] args){
        Node r=new Node(1); r.left=new Node(2); r.right=new Node(3);
        in(r);
    }
}
/* 34th prg
  INORDER TRAVERSAL OF A BINARY TREE

  What is a binary tree?
      It is a structure where each node can have:
          - a left child
          - a right child

  Our tree looks like this:

            1
           / \
          2   3

  Inorder traversal means visiting nodes in this order:
      1) Left child
      2) Root (current node)
      3) Right child

  SHORT RULE:
      LEFT → ROOT → RIGHT

  Let's walk through the steps:

  Start with root = 1

  Step 1: Go LEFT
      Visit node 2

  Node 2 does not have children, so:
      Visit LEFT of 2 → nothing
      Print 2
      Visit RIGHT of 2 → nothing

  Step 2: Come BACK to ROOT
      Print 1

  Step 3: Go RIGHT
      Visit node 3
      Node 3 has no children
      Print 3

  Final printed order:
      2 1 3

  That is INORDER traversal!
*/

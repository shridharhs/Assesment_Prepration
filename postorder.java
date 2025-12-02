
class NodePost{ int data; NodePost left,right; NodePost(int d){data=d;} }
public class postorder {
    static void post(NodePost r){
        if(r==null)return;
        post(r.left); post(r.right); System.out.print(r.data+" ");
    }
    public static void main(String[] args){
        NodePost r=new NodePost(1); r.left=new NodePost(2); r.right=new NodePost(3);
        post(r);
    }
}
/* 36th prg
  POSTORDER TRAVERSAL OF A BINARY TREE

  What is a binary tree?
      A node that has:
          - a left child
          - a right child

  Our tree:

            1
           / \
          2   3

  Postorder traversal visits nodes in this order:
      1) LEFT
      2) RIGHT
      3) ROOT (current node)

  SHORT RULE:
      LEFT → RIGHT → ROOT

  Let's follow the steps:

  Start at root = 1

  Step 1: Go LEFT to node 2
      Node 2 has no children, so:
          Visit LEFT → nothing
          Visit RIGHT → nothing
          Print 2

  Step 2: Go RIGHT to node 3
      Node 3 has no children, so:
          Visit LEFT → nothing
          Visit RIGHT → nothing
          Print 3

  Step 3: Finally visit ROOT node 1
      Print 1

  Final printed order:
      2 3 1

  This is POSTORDER traversal!
*/

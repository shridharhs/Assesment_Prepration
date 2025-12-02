
class NodePre{ int data; NodePre left,right; NodePre(int d){data=d;} }
public class preorder {
    static void pre(NodePre r){
        if(r==null)return;
        System.out.print(r.data+" "); pre(r.left); pre(r.right);
    }
    public static void main(String[] args){
        NodePre r=new NodePre(1); r.left=new NodePre(2); r.right=new NodePre(3);
        pre(r);
    }
}
/* 35th prg
  PREORDER TRAVERSAL OF A BINARY TREE

  What is a binary tree?
      A tree where each node can have:
          - a left child
          - a right child

  Our tree structure:

            1
           / \
          2   3

  Preorder traversal visits nodes in this order:
      1) ROOT
      2) LEFT
      3) RIGHT

  SHORT RULE:
      ROOT → LEFT → RIGHT

  Let's walk through the steps:

  Start at root = 1

  Step 1: Visit ROOT
      Print 1

  Step 2: Go LEFT to node 2
      Visit ROOT of this subtree → print 2
      2 has no children, so done with this side

  Step 3: Go RIGHT to node 3
      Visit ROOT of this subtree → print 3
      3 has no children

  Final printed order:
      1 2 3

  This is PREORDER traversal!
*/

public class BinaryTreeMain4 {
    public static void main(String[] args) {
            BinaryTree4 bt = new BinaryTree4();
            bt.addnodeR(6);
            bt.addnodeR(4);
            bt.addnodeR(8);
            bt.addnodeR(3);
            bt.addnodeR(5);
            bt.addnodeR(7);
            bt.addnodeR(9);
            bt.addnodeR(10);
            bt.addnodeR(15);
            System.out.print("Data Terbesar :");
            bt.maksimal();
            System.out.println("");
            System.out.print("Data terkecil :");
            bt.minimal();
            System.out.println("");
            System.out.print("Data yang ada di leaf : ");
            bt.leaf(bt.root);
            System.out.println("");
            System.out.print("PreOrder Traversal :");
            bt.traversePreOrder(bt.root);
            System.out.println("");
            System.out.print("inOrder Traversal :");
            bt.traverseInOrder(bt.root);
            System.out.println("");
            System.out.print("PostOrder Traversal :");
            bt.traversePostOrder(bt.root);
            System.out.println("");
            System.out.println("Find Node : "+bt.find(5));
            System.out.println("Delete Node 8");
            bt.delete(8);
            System.out.println("");
            System.out.print("PreOrder Traversal :");
            bt.traversePreOrder(bt.root);
            System.out.println("");
        }
    }

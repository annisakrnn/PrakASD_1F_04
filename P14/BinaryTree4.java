public class BinaryTree4 {
    node4 root;

    public BinaryTree4(){
        root = null;
    }
    boolean isEmpty(){
        return root==null;
    }
    void add(int data) {
        if (isEmpty()) { 
            root = new node4(data);
        } else {
            node4 current = root;
            while (true) {
                if (data < current.data) { 
                    if (current.left == null) {
                        current.left = new node4(data); 
                        break;
                    } else {
                        current = current.left; 
                    }
                } else if (data > current.data) { 
                    if (current.right == null) {
                        current.right = new node4(data); 
                        break;
                    } else {
                        current = current.right; 
                    }
                } else { 
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        node4 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }
    void addnodeR(int data){
        root = addnodeR(root, data);
    }
    public node4 addnodeR(node4 current, int data){
        if (current == null) {
            return new node4(data);
        }
        if (data<current.data) {
            current.left = addnodeR(current.left, data);
        }else if (data>current.data) {
            current.right = addnodeR(current.right, data);
        }else{
            return current;
        }
        return current;
    }
    void traversePreOrder(node4 node) {
        if (node != null) {
            System.out.print("" + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(node4 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(node4 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    node4 getSuccessor(node4 deleteNode) { 
        node4 successor = deleteNode.right;
        node4 successorParent = deleteNode;
        while(successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != deleteNode.right) {
            successorParent.left = successor.right;
            successor.right = deleteNode.right;
        }
        return successor;
    }

    void delete(int data) {
        if(isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
       
        node4 parent = root;
        node4 current = root;
        boolean isLeftChild = false;
        while(current != null) {
            if(current.data == data) {
                break;
            } else if(data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        } 
        if(current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            
            if(current.left == null && current.right == null) {
                if(current == root) {
                    root = null;
                } else {
                    if(isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if(current.left == null) { 
                if(current == root) {
                    root = current.right;
                } else {
                    if(isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if(current.right == null) { 
                if(current == root) {
                    root = current.left;
                } else {
                    if(isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { 
                node4 successor = getSuccessor(current);
                if(current == root) {
                    root = successor;
                } else {
                    if(isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}
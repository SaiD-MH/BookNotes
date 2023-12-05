package binarytree;

import java.util.Stack;

public class Tree {

    private Node root;

    public Tree() {
        root = null;
    }

    public Node find(int key) {

        Node cur = root;

        while (cur.data != key) {

            if (key < cur.data) {
                cur = cur.leftChild;
            } else {
                cur = cur.rightChild;
            }

            if (cur == null) {
                return null;
            }

        }

        return cur;
    }

    void insert(int key) {

        Node newNode = new Node();
        newNode.data = key;

        if (root == null) {// no nodes yrt

            root = newNode;
            return;
        }

        Node cur = root, parent;

        while (true) {
            parent = cur;

            if (key < cur.data) {

                cur = cur.rightChild;

                if (cur == null) {
                    parent.leftChild = newNode;
                    return;
                }

            } else {

                cur = cur.rightChild;

                if (cur == null) {
                    parent.rightChild = newNode;
                    return;
                }

            }

        }

    }

    public Node findMin() {

        Node cur = root, last = null;

        while (cur != null) {
            last = cur;
            cur = cur.leftChild;
        }

        return last;
    }

    public Node findMax() {

        Node cur = root, last = null;

        while (cur != null) {
            last = cur;
            cur = cur.rightChild;
        }

        return last;
    }

    public Node getSuccussor(Node delNode) {

        Node parSuc = delNode;
        Node successor = delNode;
        Node cur = delNode.rightChild;

        while (cur != null) {
            parSuc = cur;
            successor = cur;
            cur = cur.leftChild;
        }

        if (successor != delNode.rightChild) {

            parSuc.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;

        }

        return successor;
    }

    public boolean deleteNode(int key) {

        Node par = null, cur = root;
        boolean foundYouAtParentLeft = true;   // to know when delete from parent node whatto delete left node or right node
        while (key != cur.data) {

            par = cur;
            if (key > cur.data) {
                cur = cur.rightChild;
                foundYouAtParentLeft = false;
            } else {
                cur = cur.leftChild;
                foundYouAtParentLeft = true;
            }

            if (cur == null) {
                return false;
            }
        }

        // i have node to delete 
        if (cur.leftChild == null && cur.rightChild == null) { // Leaf node has no child Case 1 :

            if (cur == root) {
                root = null;
            } else if (foundYouAtParentLeft) {
                par.leftChild = null;
            } else {
                par.rightChild = null;
            }

        } else if (cur.rightChild == null) {

            if (cur == root) {
                root = cur.leftChild;
            } else if (foundYouAtParentLeft) {
                par.leftChild = cur.leftChild;
            } else {
                par.rightChild = cur.leftChild;
            }

        } else if (cur.leftChild == null) {
            if (cur == root) {
                root = cur.rightChild;
            } else if (foundYouAtParentLeft) {
                par.leftChild = cur.rightChild;
            } else {
                par.rightChild = cur.rightChild;
            }
        } else {

            Node succussor = getSuccussor(cur);
            if (cur == root) {
                root = succussor;
            } else if (foundYouAtParentLeft) {
                par.leftChild = succussor;
            } else {
                par.rightChild = succussor;
            }

        }

        return true;
    }

    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1:
                System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("\nInorder traversal: ");
                inOrder(root);
                break;
            case 3:
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println();
    }

    private void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.data + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }
// -------------------------------------------------------------

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.data + " ");
            inOrder(localRoot.rightChild);
        }
    }
// -------------------------------------------------------------

    private void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.data + " ");
        }
    }

    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(
                "......................................................");
        while (isRowEmpty == false) {

            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < nBlanks; j++) {
                System.out.print(" ");
            }
            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.data);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if (temp.leftChild != null
                            || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++) {
                    System.out.print(" ");
                }
            } // end while globalStack not empty
            System.out.println();
            nBlanks /= 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        } // end while isRowEmpty is false
        System.out.println(
                "......................................................");
    } // end displayTree()

}

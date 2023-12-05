package binarytree;

public class BinaryTree {

    public static void main(String[] args) {

        int value;
        Tree theTree = new Tree();

        theTree.insert(5);
        theTree.insert(25);
        theTree.insert(75);
        theTree.insert(12);
        theTree.insert(37);
        theTree.insert(43);
        theTree.insert(30);
        theTree.insert(33);
        theTree.insert(87);
        theTree.insert(93);
        theTree.insert(97);

        theTree.traverse(1);
        theTree.deleteNode(33);
        theTree.displayTree();
    }
    
}

package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);

//        myBST.insert(27);
//
//        System.out.println(myBST.contains(27));

//        System.out.println("\nBST Contains 27:");
//        System.out.println(myBST.rContains(27));
//
//        System.out.println("\nBST Contains 17:");
//        System.out.println(myBST.rContains(17));

        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("Root->Left: " + myBST.root.left.value);
        System.out.println("Root->Right: " + myBST.root.right.value);

        myBST.deleteNode(2);

        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("Root->Left: " + myBST.root.left.value);
        System.out.println("Root->Right: " + myBST.root.right.value);
    }
}

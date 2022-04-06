package TH12_BINARYTREE;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.add(55);
        bst.add(82);
        bst.add(41);
        bst.add(53);
        bst.add(64);
        bst.add(78);
        bst.add(92);
        bst.add(51);


        System.out.println("\n 53 is: "+bst.search(41));
    }
}

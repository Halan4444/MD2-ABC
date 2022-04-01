package TH10_LINKEDLIST;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList Lan = new MyLinkedList(10);
        Lan.addFirst(11);
        Lan.addFirst(12);
        Lan.addFirst(13);

        Lan.add(4,9);
        Lan.add(4,9);
        Lan.printList();
    }
}

package TH11_LUYENTAPQUEUE;

public class Tes {
    public static void main(String[] args) {
        Solution q = new Solution();
        q.front = q.rear = null;

        q.enQueue(14);
        q.enQueue(22);
        q.enQueue(33);
        q.enQueue(44);
        q.enQueue(55);

        q.display(q);

        System.out.println("Số deQueue " + q.deQueue().data);
        System.out.println("Số deQueue " + q.deQueue().data);
        System.out.println("Số deQueue " + q.deQueue().data);
        System.out.println("Số deQueue " + q.deQueue().data);



        q.display(q);

    }
}

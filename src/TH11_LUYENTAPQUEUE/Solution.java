package TH11_LUYENTAPQUEUE;

public class Solution extends Queue{

    public Solution(Node front, Node rear) {
        super(front, rear);
    }

    public Solution() {

    }

    public void enQueue(int data) {
        Node template = new Node(data);
        if (this.rear == null) {
            this.front = template;
            this.rear = template;
            rear.next = front;
            return;
        }
        this.rear.next = template;
        this.rear = template;
        rear.next = front;
    }

    public Node deQueue() {
        if (this.front == null) {
            return null;
        }
        Node template = this.front;
        this.front = this.front.next;
        this.rear.next = front;
        if (this.front == null) {
            this.rear = null;
        }
        return template;
    }

    public void display(Queue q) {
        Node temp = q.front;
        temp.toString();
        System.out.print(" Elements in Circular Queue are: ");


        while (temp.next != q.front) {
            System.out.println(temp.data);
            temp = temp.next;
        }System.out.println(temp.data);

//       for (int i =0; i<1;i++) {
//           System.out.println(temp.data);
//           front = front.next;
//       }
//        for (int i=0; i<q.length;i++){
//            System.out.println(temp.data);
//          temp = temp.next;
//        }
    }

}

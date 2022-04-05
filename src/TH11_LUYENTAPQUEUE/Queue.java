package TH11_LUYENTAPQUEUE;

public class Queue  {

    public Node front;
    public Node rear;
    protected int length;

    public Queue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }

    public Queue() {
    }
}


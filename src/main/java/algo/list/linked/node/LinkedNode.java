package algo.list.linked.node;


public class LinkedNode<T> {

    private T data;

    private LinkedNode<T> next;

    public LinkedNode(T data, LinkedNode<T> next) {
        this.data = data;
        this.next = next;
    }
    public T getData() {
        return data;
    }

    public LinkedNode<T> getNextNode(){
        return this.next;
    }

    public void setNext(LinkedNode<T> node) {
        this.next = node;
    }

}

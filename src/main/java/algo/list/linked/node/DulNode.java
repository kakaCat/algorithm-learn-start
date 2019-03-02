package algo.list.linked.node;

public class DulNode<T> {

    private T data;
    private DulNode<T> next;
    private DulNode<T> pre;

    public DulNode(T data, DulNode<T> next,DulNode<T> pre) {
        this.data = data;
        this.next = next;
        this.pre = pre;
    }
    public T getData() {
        return data;
    }

}

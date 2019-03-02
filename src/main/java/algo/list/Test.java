package algo.list;

import algo.list.linked.LinkedListAlgo;
import algo.list.linked.node.LinkedNode;
import algo.list.linked.utils.LinkedListRecursionUtils;
import algo.list.linked.utils.LinkedListUtils;

public class Test {

    private static LinkedNode<Integer> node;

    static {
        node = new LinkedNode(1, null);
        node.setNext(new LinkedNode<>(2,new LinkedNode<>(3,null)));
    }


    public static void main(String[] args) {
        LinkedListAlgo.Node node3 = new LinkedListAlgo.Node(3, null);
        LinkedListAlgo.Node node2 = new LinkedListAlgo.Node(2, node3);
        LinkedListAlgo.Node node1 = new LinkedListAlgo.Node(1, node2);

        LinkedListAlgo.reverse1(node1);
        System.out.println(node1);
//        LinkedListUtils.reverse(node);

//        LinkedNode reverseNode = LinkedListRecursionUtils.reverse(node);
//
//        System.out.println(reverseNode);
    }

}

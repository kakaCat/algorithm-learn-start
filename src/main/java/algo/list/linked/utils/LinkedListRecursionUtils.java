package algo.list.linked.utils;

import algo.list.linked.node.LinkedNode;

public class LinkedListRecursionUtils {

    public static LinkedNode reverse(LinkedNode list){

        LinkedNode current = list;
        if(current.getNextNode()==null){
            return current;
        }

        LinkedNode head = reverse(current.getNextNode());
        current.getNextNode().setNext(current);
        current.setNext(null);

        return head;
    }

}

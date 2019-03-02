package algo.list.linked.utils;

import algo.list.linked.node.LinkedNode;

public class LinkedListUtils {

    public static LinkedNode reverse(LinkedNode list) {
        LinkedNode current = list;

        LinkedNode head = null;

        LinkedNode pre = null;

        while (current != null) {
            LinkedNode tempNextNode = current.getNextNode();
            if(tempNextNode == null){
                head = current;
            }
            current.setNext(pre);
            pre = current;
            current = tempNextNode;
        }

        return head;
    }




}

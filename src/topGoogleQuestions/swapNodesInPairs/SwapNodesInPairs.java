package topGoogleQuestions.swapNodesInPairs;

import topGoogleQuestions.removeNthNodeFromEndOfList.LinkList;
import topGoogleQuestions.removeNthNodeFromEndOfList.Node;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addValue(1);
        list.addValue(2);
        list.addValue(3);
        list.addValue(4);
        list.displayList();

        System.out.println();
        System.out.println("---- after swapping the numbers ----");
        swapNodesInPairs(list);
        list.displayList();
    }
    public static void swapNodesInPairs(LinkList linkList){
        Node current = linkList.getNodes();
        while (current != null){
            int holder = current.value;
            current.value = current.next.value;
            current.next.value = holder;
            current = current.next.next;
        }
    }
}

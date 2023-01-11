package topGoogleQuestions.number45;

import topGoogleQuestions.number8.LinkList;
import topGoogleQuestions.number8.Node;

public class DeleteNodeInALinkedList {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addValue(9);
        list.addValue(1);
        list.addValue(5);
        list.addValue(4);
        int value = 5;
        deleteNodeInLinkedList(list, value);
        list.displayList();
    }
    public static void deleteNodeInLinkedList(LinkList list, int value){
        Node nodes = list.getNodes();
        while(nodes != null){
            if(nodes.next.value == value){
                nodes.next = nodes.next.next;
                break;
            }
            nodes = nodes.next;
        }

    }

}

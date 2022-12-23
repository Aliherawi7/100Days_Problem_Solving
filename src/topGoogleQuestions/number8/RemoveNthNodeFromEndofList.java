package topGoogleQuestions.number8;

public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
        LinkList myList = new LinkList();
        myList.addValue(1);
        myList.addValue(2);
        myList.addValue(3);
        myList.addValue(4);
        myList.addValue(5);
        myList.displayList();
        System.out.println();
        System.out.println("---- after deleting the nth node -----");
        removeNthNodeFromEndofList(myList, 2);
        myList.displayList();
    }

    public static void removeNthNodeFromEndofList(LinkList linkList, int nthNode){
        Node node = linkList.getNodes();
        if(nthNode == 1){
            linkList.removeFirst();
            return;
        }
        int counter = 2;
        Node current = node;
        while(current != null){
            if(counter == nthNode){
                current.next = current.next.next;
                break;
            }
            counter++;
            current = current.next;
        }
    }
}




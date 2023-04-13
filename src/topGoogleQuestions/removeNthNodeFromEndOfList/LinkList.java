package topGoogleQuestions.removeNthNodeFromEndOfList;

public class LinkList {
    Node first;
    public LinkList(){
        first = null;
    }

    public void addValue(int value){
        Node node = new Node(value);
        node.next = first;
        first = node;
    }

    public int removeFirst(){
        int temp = first.value;
        first = first.next;
        return temp;
    }

    public Node getNodes(){
        return first;
    }

    public void displayList(){
        Node current = first;
        while(current != null) {
            current.displayNode();
            current = current.next;
        }
    }
    public boolean isEmpty(){
        return first == null;
    }






}


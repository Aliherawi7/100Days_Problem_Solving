package topGoogleQuestions.number8;

public class Node {
    public int value;
    public Node next;
    public Node(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public Node getNext(){
        return next;
    }

    public void displayNode(){
        System.out.print(value + " ");
    }
}

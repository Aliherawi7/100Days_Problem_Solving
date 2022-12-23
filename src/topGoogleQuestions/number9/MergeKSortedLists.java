package topGoogleQuestions.number9;

import topGoogleQuestions.number8.LinkList;
import topGoogleQuestions.number8.Node;

import java.util.ArrayList;

public class MergeKSortedLists {
    public static void main(String[] args) {
        LinkList myList = new LinkList();
        myList.addValue(1);
        myList.addValue(4);
        myList.addValue(5);
        LinkList myList1 = new LinkList();
        myList1.addValue(1);
        myList1.addValue(3);
        myList1.addValue(4);
        LinkList myList2 = new LinkList();
        myList2.addValue(2);
        myList2.addValue(6);

        mergeKSortedLists(new LinkList[]{myList, myList1, myList2})
                .displayList();

    }

    public static LinkList mergeKSortedLists(LinkList[] lists){
        ArrayList<Integer> allNumbers = new ArrayList<>();

        // select each list in the lists array and add all its value to the allNumber arraylist
        for(LinkList linkList : lists){
            Node current = linkList.getNodes();
            while(current != null){
                allNumbers.add(current.value);
                current = current.next;
            }
        }

        // in here we sort the arraylist
        allNumbers.sort(Integer::compareTo);
        LinkList newLinkList = new LinkList();
        // in here we add the numbers to a new linklist
        allNumbers.forEach(newLinkList::addValue);
        return newLinkList;
    }
}

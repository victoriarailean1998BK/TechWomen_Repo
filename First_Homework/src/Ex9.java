import java.util.LinkedList;

public class Ex9 {
    public static void main (String [] args){
        LinkedList<Integer> linkedList = new LinkedList();
        for(int i =0; i <= 10; i++){
            linkedList.add(i);
        }
        System.out.println("Elements:" + linkedList);
        linkedList= reverseLinkedList(linkedList);
        System.out.print("\nElements after reversing: " + linkedList);
    }
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
    {
        LinkedList<Integer> revLinkedList = new LinkedList<>();
        for (int i = llist.size() - 1; i >= 0; i--) {
            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;
    }
}

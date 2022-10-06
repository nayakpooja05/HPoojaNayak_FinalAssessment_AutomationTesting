package JavaOOPS;
import java.util.LinkedList;

public class LinkedListCollection_Java {
	public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Pooja");
        ll.add("Arpitha");
        System.out.println(ll);
        System.out.println();
        ll.addLast("Shreema");
        ll.addFirst("Shreyank");
        ll.add(2, "Shivani");
        System.out.println(ll);
        System.out.println();
       
        ll.remove("Pooja");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);
    }
}


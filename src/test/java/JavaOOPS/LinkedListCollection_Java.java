package JavaOOPS;
import java.util.LinkedList;

public class LinkedListCollection_Java {
	public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("List types of healthcare services");
        ll.add("Mental health care");
        ll.add("Dental care");
       
        System.out.println(ll);
        System.out.println();
        ll.addLast("Laboratory and diagnostic care");
        ll.addFirst("Substance abuse treatment");
        ll.add(2, "Preventative care");
        System.out.println(ll);
        System.out.println();
        ll.remove("Dental care");
    
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);
    }
}


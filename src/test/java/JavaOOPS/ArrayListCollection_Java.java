package JavaOOPS;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class ArrayListCollection_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values=new ArrayList();
		System.out.println("List some types of Insurance and its birthyear");
		values.add("Health Insurance");
		values.add(1986);
		values.add("Motor Insurance");
		values.add(1988);
		values.add("Home Insurance");
		values.add(1950);
		Iterator i= values.iterator();
		while(i.hasNext())//returns true if there is another line in input
		{
			System.out.println(i.next());
	
		}
		System.out.println("Remove the data of Motor Insurance");
		values.remove("Motor Insurance");
		values.remove(1988);
		Iterator j= values.iterator();//an object that can be used to loop through collection
		
		while(j.hasNext())//returns true if there is another line in input
		{
			System.out.println(j.next());
	
		}
	}

}

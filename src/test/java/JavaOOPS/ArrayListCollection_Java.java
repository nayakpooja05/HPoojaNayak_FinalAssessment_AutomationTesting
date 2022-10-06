package JavaOOPS;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class ArrayListCollection_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values=new ArrayList();
		values.add("Pooja");
		values.add(10);
		values.add(67.56);
		Iterator i= values.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
	
		}
	}

}

import java.util.*;  
public class LinkedListEg
{  
	public static void main(String args[])
	{  
		LinkedList<String> list=new LinkedList<>();   
      	list.add("ABC");    
      	list.add("EFG");    
      	list.add("MNO");
		list.add("PQR");
		list.add("UVW");
      	list.add("XYZ");    
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());   
		}  
	}
}  
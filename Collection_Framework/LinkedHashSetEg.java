import java.util.*;  
class LinkedHashSetEg
{  
	public static void main(String args[])
	{ 
		LinkedHashSet<String> set=new LinkedHashSet<>();  
		set.add("One");    
		set.add("Two");    
		set.add("Three"); 
		set.add("Four"); 
		set.add("Five");  
		Iterator<String> i=set.iterator();  
		while(i.hasNext())  
		{  
			System.out.println(i.next());  
		}  
	}  
}  
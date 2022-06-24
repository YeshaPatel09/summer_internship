import java.util.*;  
class TreeSetEg
{  
	public static void main(String args[])
	{  
		TreeSet<String> set=new TreeSet<>();  
		set.add("One");  
		set.add("Two");  
  		set.add("Three");  
  		set.add("Four");
		set.add("Five");    
  		Iterator<String> itr=set.iterator();  
  		while(itr.hasNext())
		{  
   			System.out.println(itr.next());  
  		}  
	}  
} 
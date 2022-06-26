import java.util.*;  
class GenericsEg
{  
	public static void main(String args[])
	{  
		ArrayList<String> list=new ArrayList<String>();  
		list.add("abc");  
		list.add("xyz");    
		String s=list.get(1);
		System.out.println("element is: "+s);  
  		Iterator<String> itr=list.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
	}  
}  
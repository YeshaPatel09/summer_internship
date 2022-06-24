import java.util.*;  
class LinkedHashMapEg
{  
	public static void main(String args[])
	{  
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  		hm.put(1,"ABC");  
		hm.put(2,"EFG");  
  		hm.put(3,"PQR");  
  		hm.put(4,"UVW");
		hm.put(5,"XYZ");    
		for(Map.Entry m:hm.entrySet())
		{  
			System.out.println(m.getKey()+" "+m.getValue());  
  		}  
 	}  
}  
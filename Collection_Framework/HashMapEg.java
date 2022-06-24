import java.util.*;  
public class HashMapEg
{  
	public static void main(String args[])
	{  
		HashMap<Integer,String> map=new HashMap<Integer,String>();    
   		map.put(1,"ABC");  
   		map.put(2,"EFG");    
   		map.put(3,"PQR");   
		map.put(4,"UVW");   
		map.put(5,"XYZ");     
   		System.out.println("Iterating Hashmap...");  
   		for(Map.Entry m : map.entrySet())
		{    
    			System.out.println(m.getKey()+" "+m.getValue());    
   		}  
	}  
}  
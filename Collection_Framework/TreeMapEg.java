import java.util.*;  
class TreeMapEg
{  
	public static void main(String args[])
	{  
   		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      	map.put(1,"EFG");    
      	map.put(2,"XYZ");    
      	map.put(3,"PQR");    
      	map.put(4,"ABC");
		map.put(5,"UVW");    
		for(Map.Entry m:map.entrySet())
		{    
       		System.out.println(m.getKey()+" "+m.getValue());    
      	}    
 	}  
}  
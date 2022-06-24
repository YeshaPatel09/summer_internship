abstract class Bank
{    
	abstract int getRateOfInterest();    
}   
 
class BOI extends Bank
{    
	int getRateOfInterest()
	{
		return 9;
	}    
}    

class BOB extends Bank	
	{    
	int getRateOfInterest()
	{
		return 6;
	}    
}    

//main class
class Abstraction
{    
	public static void main(String args[])
	{    
		Bank b;  
		b=new BOI();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		b=new BOB();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
	}
}    
class Inherit
{  
	void abc()
	{
		System.out.println("Hello!!");
	}  
}  


class A extends Inherit
{  
	void xyz()
	{
		System.out.println("How are you?");
	}  
}  

// main class
class Inheritance
{  
	public static void main(String args[])
	{  
		A a=new A();  
		a.abc();  
		a.xyz();  
	}
}  
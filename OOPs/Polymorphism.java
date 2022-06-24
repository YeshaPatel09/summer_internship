class Helper 
{
	static int Multiply(int a, int b)
	{		
		return a * b;
	}
	static int Multiply(int a, int b, int c)
	{
		return a * b * c;
	}
}


// Main class
class Polymorphism 
{
	public static void main(String[] args)
	{
		System.out.println(Helper.Multiply(18, 43));
		System.out.println(Helper.Multiply(20, 54, 67));
	}
}

package basicProgram;

public class EvenOrOdd 
{
	static void EvenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println("The given number is even");
		}
		else
		{
			System.out.println("The given numer is odd");
		}
	}
	public static void main(String[] args) 
	{
		EvenOdd(20);
	}
}

package basicProgram;

public class Factorial 
{
	public static void fact(int num)
	{
		int mul=1;
		for(int i=5;i>=num;i--)
		{
			mul=mul*i;
		}
		System.out.println(mul);
		
	}
	public static void main(String[] args)
	{
		fact(1);
		
	}

}

package Program;

public class StrongNumber 
{

	public static void main(String[] args)
	{
		int num=145,sum=0,temp=num;
		while(num>0)
		{
			int rem=num%10;
			int fact=1;
			while(rem>0)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			num=num/10;
		}
		System.out.println("The number is" +sum);
		if(sum==temp)
		{
			System.out.println("The given number is strong");
		}
		else
		{
			System.out.println("The given is not a strong");
		}
	}

}

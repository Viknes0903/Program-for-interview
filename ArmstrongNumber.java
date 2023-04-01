package basicProgram;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int num=143,sum=0,temp=num;
		while(num>0);
		{
			int rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
			System.out.println(num);
		}
		if(sum==temp)
		{
			System.out.println("The given number is armstrong");
		}
		else
		{
			System.out.println("The given number is not armstrong");
		}

	}

}

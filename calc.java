public class calc 
{
	public static void main(String args[]) 
	{
		Double result;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		Double a= Double.parseDouble(args[0]);
		Double b= Double.parseDouble(args[1]);
		System.out.println("Select the operation you want to perform:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division:");
		int n= sc.nextInt();
		if(n<=4)
		{
			if(n==1)
			{
				result=a+b;
				System.out.println("Result is:"+result);
			}
			else if(n==2)
			{
				result=a-b;
				System.out.println("Result is:"+result);
			}
			else if(n==3)
			{
				result=a*b;
				System.out.println("Result is:"+result);
			}
			else
			{
				result=a/b;
				System.out.println("Result is:"+result);
			}
		}
		else
		{
			System.out.println("Enter the valid choice..");
		}
		
		sc.close();
	}
}



public class Fibonacci {
	
	public static int fibonacci(int nth)
	{
		if(nth <= 1)
		{
			return nth;
		}
		else
		{
			return fibonacci(nth-1) + fibonacci(nth - 2);
		}
			
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci!");
		int nth = 3;
		
		for(int i=0; i<nth; i++)
		{
			int fib = fibonacci(i);
			System.out.print(fib);
			if(i<nth-1)
			{
				System.out.print(", ");
			}
		}
		
	}

}

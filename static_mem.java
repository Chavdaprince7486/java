class G1
{
	public static int sum(int a ,int b)
	{
			return a+b;
			
	}
}
class static_mem
{
	public static void main(String[]args)
	{
		int n=3, m=6;
		int s = G1.sum(n,m);
		System.out.println("sum is"+s);
		
	}		
}
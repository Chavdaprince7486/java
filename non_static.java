class G2
{
	public static int sum(int a ,int b)
	{
			return a+b;
			
	}
}
class non_static
{
	public static void main(String[]args)
	{
		G2 g= new G2();
		int a = g.sum(20,80); 
		System.out.println(a);
		
	}		
}
class encap{
	int length;
	int breadth;
	void getdata()
	{
			int a = length*breadth;
			System.out.println("encapsulation"+a);
			
	}
	
}
class main{
		public static void main(String []args)
		{
				encap obj= new encap();
				obj.length=5;
				obj.breadth=6;
				obj.getdata();
				
		}
}
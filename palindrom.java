class palindrom
{
	 public static void main(String[]args)
	 {
			int num = 121;
			int temp = num;
			int rev = 0;
			while(num>0)
			{
					int r= num%10
					rev=rev*10+r;
					num = num/10;
			}
			if(temp==rev)
				System.out.println("palindrom numbers");
			else
				System.out.println("not palindrom");
	 }
}
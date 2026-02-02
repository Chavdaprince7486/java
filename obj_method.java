class obj_method
{
		string title;
		obj_method(String title)
		{
				this.title=title;
		}
		public boolean equals(object obj)
		{
				obj_method m = (obj_method)obj;
				return this.title.equals(m.title);
		}
		public static void main(String[]args)
		{
				obj_method m1 = new obj_method ("java");
				obj_method m2 = new obj_method ("java");
				System.out.println(m1.equals(m2));
		}
	
}
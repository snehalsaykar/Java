class ExceptionDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("start program");
		String str="Hello";
		try{
			System.out.println(str.charAt(-1));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled");
		}
		System.out.println("end program");
	}
}

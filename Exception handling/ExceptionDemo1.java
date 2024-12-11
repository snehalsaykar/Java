//program Array
class ExceptionDemo1
{
	public static void main(String[] args) 
	{
		System.out.println("start of the program");
		int[]a=new int[5];
		try{
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("end of the program");
	}
}

class VDemo3 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		boolean res1 = (a > b) || (a < b);
		boolean res2 = (a >= b) && (a <= b);
		boolean res3 = (a == b) && (a != b);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}
}

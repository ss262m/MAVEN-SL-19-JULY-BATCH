package mypkg;

public class MyCalc {
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public int mod(int a, int b)
	{
		return a%b;
	}
	public void branch()
	{
		System.out.println("Hello from Master Branch, Have started with github actions");
	}

	public static void main(String[] args) {

		MyCalc calc = new MyCalc();
		System.out.println("Sum is :"+calc.sum(20, 10));
		System.out.println("Diff is :"+calc.diff(20, 10));
		System.out.println("mul is :"+calc.mul(20, 10));
		System.out.println("Div is :"+calc.div(20, 10));
		System.out.println("Mod is :"+calc.mod(20, 10));
		calc.branch();
	}

}

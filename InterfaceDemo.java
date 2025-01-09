interface X
{
	int a = 50;
	void add();
	void sub();
	void mod();
}

interface Y
{
	int b = 10;
	void mult();
	void div();
	void mod();
}

interface Z extends X,Y
{
}

class Calculator implements Z
{
	public void add()
	{
		System.out.println("Addition: "+(X.a+Y.b));
	}
	public void sub()
	{
		System.out.println("Subtraction: "+(X.a-Y.b));
	}
	public void mult()
	{
		System.out.println("Multiplication: "+(X.a*Y.b));
	}
	public void div()
	{
		System.out.println("Division: "+(X.a/Y.b));
	}
	public void mod()
	{
		System.out.println("Modulus: "+(X.a%Y.b));
	}
}

public class InterfaceDemo
{
	public static void main(String[] args)
	{
		Calculator c1 = new Calculator();
		
		X x1 = c1;
		x1.add();
		x1.sub();
		x1.mod();
		System.out.println("------------------");

		Y y1 = c1;
		y1.mult();
		y1.div();
		y1.mod();
		System.out.println("------------------");

		Z z1 = c1;
		z1.add();
		z1.sub();
		z1.mult();
		z1.div();
		z1.mod();
	}
}
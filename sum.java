//addition of two number
import java.io.*;
class sum
{
	public static void main(String[] args) 
		throws Exception
	{
		int a,b,c;
		DataInputStream sc=new DataInputStream(System.in);
		System.out.println("enter the 1st number:");
		a=Integer.parseInt(sc.readLine());
		System.out.println("enter the 2nd no.:");
		b=Integer.parseInt(sc.readLine());
		c=a+b;
		System.out.println("sum of the two no. is:"+c);
	

		System.out.println("Hello World!");
	}
}

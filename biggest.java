//wap to find out the biggest number among the three number using datainputstream
import java.io.*;
class biggest 
{
	public static void main(String[] args)
		throws Exception
	{
		int a,b,c;
		DataInputStream B=new DataInputStream(System.in);
		System.out.println("enter the first no.:");
		a=Integer.parseInt(B.readLine());
		System.out.println("enter the second no.:");
		b=Integer.parseInt(B.readLine());
		System.out.println("enter the third no.:");
		c=Integer.parseInt(B.readLine());
		if(a>b&&a>c)
			System.out.println(a+"is the bigest no.");
			else 
			    if(b>a&&b>c)
			     System.out.println(b+"is the biggest no.");
			    else
                 System.out.println("is the biggest no."+c);
				
		System.out.println("Hello World!");
	}
}

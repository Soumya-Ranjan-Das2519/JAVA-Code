//wap to input two number through keyboard using bufferedreader find out the sum of the 2 no. 
import java.io.*;
class buffered
{
	public static void main(String[] args)
		throws Exception
	{
		int a,b,sum;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the first no.:");
		a=Integer.parseInt(br.readLine());
		System.out.println("enter the second no.:");
		b=Integer.parseInt(br.readLine());
		sum=a+b;
		System.out.print("sum of two number is:\t"+sum);
		System.out.println("Hello World!");
	}
}

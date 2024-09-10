//wap to input the principal value,rate of intrest,total time taken by user keyboard to find out the simple intrest
import java.io.*;
class simpleint 
{
	public static void main(String[] args) 
		throws Exception
	{
		float si,p,r,t;
		DataInputStream simp=new DataInputStream(System.in);
		System.out.println("enter the principle value:");
		p=Float.valueOf(simp.readLine()).floatValue();
		System.out.println("enter the rate of intrest:");
		r=Float.valueOf(simp.readLine()).floatValue();
		System.out.println("enter the time taken :");
		t=Float.valueOf(simp.readLine()).floatValue();
		si=(p*r*t)/100;
		System.out.println("principle value is="+p);
		System.out.println("rate of intrest is="+r);
		System.out.println("time taken is="+t);
		System.out.println("total simple intrest is="+si);



		System.out.println("Hello World!");
	}
}

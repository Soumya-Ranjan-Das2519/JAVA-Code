//wap to display the area of the right angle triangle using buffered redaer class
import java.io.*;
class area{
	public static void main(String[] args)
		throws Exception
		{
		int a,b,h;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the height of the triangle:");
		h=Integer.parseInt(br.readLine());
		System.out.println("enter the breath of the triangle:");
		b=Integer.parseInt(br.readLine());
		a=(h*b)/2;
		System.out.println("area of the rightangle triangle is :"+a);
	
	}
}
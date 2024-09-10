//wap to read a charecter using sanner class
import java.util.*;
class  charecter
{
	public static void main(String[] args) 
	{
		char s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the charecter:");
              s=sc.next().charAt(0);
		System.out.println("the charecter is:"+s);
		System.out.println("Hello World!");
	}
}

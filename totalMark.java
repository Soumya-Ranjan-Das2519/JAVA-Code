//wap to calculate the percentage of a student to entering the mark through the keyboard. it is mark from 5 subject .
import java.util.*;
class totalMark  
{
	public static void main(String[] args) 
	{
		float total,prcnt,eng,math,phy,chem,bio;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the eng mark:");
			eng=sc.nextFloat();
		System.out.println("enter the math mark:");
			math=sc.nextFloat();
		System.out.println("enter the bio mark:");
			bio=sc.nextFloat();
		System.out.println("enter the phy mark:");
			phy=sc.nextFloat();
		System.out.println("enter the chem mark:");
			chem=sc.nextFloat();
			total=eng+math+phy+chem+bio;
			prcnt=total/500*100;
		System.out.println("total mark sequer:"+total);

        System.out.println("total aquired percentage is:"+prcnt);
		System.out.println("Hello World!");
	}
}


import javax.swing.*;
class JButtondemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
			JFrame f=new JFrame("buttondemo");
			JButton b=new JButton("click here");
			b.setBounds(50,100,95,30);
			f.add(b);
			f.setSize(400,500);
			f.setLayout(null);
			f.setVisible(true);
			//b.setBackground(Color.RED);
			f.setBackground(Color.BLUE);

	}
}
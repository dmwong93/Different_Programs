import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Constructors_Calc
{
	public static void main(String[] args)
	{
		String task;
		final ImageIcon icon = new ImageIcon("/Users/derekwong/Desktop/1.jpeg");
		int num = 5;
		JOptionPane.showMessageDialog(null, "This is a calculator for Contractors, " +
						"it's able to do many tasks.", "Construtors Calculator",  JOptionPane.INFORMATION_MESSAGE, icon);
		task = JOptionPane.showInputDialog("The task are: \n" +
					"1. Find area\n" +
					"2. Convert feet to meters\n" +
					"3. Convert inches to centemeters\n" +
					"4. Convert inches to feet\n" +
					"5. Convert temperature\n" +
					"6. Display Client Bugget\n" +
					"Which of these task would you like to perform(enter " +
					"only the number.)");
		int result = Integer.parseInt(task);

		switch (result)
		{
			case 1:
			double area;
			area = displayArea();
			JOptionPane.showMessageDialog(null, "The area is: " + area);
			break;

			case 2:
			double meters;
			meters = displayMeter();
			JOptionPane.showMessageDialog(null, "Meters: " + meters);
			break;
			
			default:
			System.out.print("yolo");

		}
	}
	public static double displayArea()
	{
			double length;
			double width;
			double area;
			String l;
			String w;
			l = JOptionPane.showInputDialog("What is the length");
			w = JOptionPane.showInputDialog("What is the width");

			length = Double.parseDouble(l);
			width = Double.parseDouble(w);			
 
			return area = length * width;	
	}

	public static double displayMeter()
	{
			double feet;
			double meter;
			String f;
			String m;
			f = JOptionPane.showInputDialog("How many feet");

			feet = Double.parseDouble(f);	

			return meter = feet / 3.28084; 
	}
	

	
}
						

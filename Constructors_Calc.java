import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.io.*;

public class Constructors_Calc
{
	public static void main(String[] args) throws IOException
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
					"5. Convert Fº to Cº\n" +
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
			
				case 3:
				double cent;
				cent = displayCent();
				JOptionPane.showMessageDialog(null, "Centermeters: " + cent);
				break;

				case 4:
				double fee;
				fee = displayFeet();
				JOptionPane.showMessageDialog(null, "Feet: " + fee);
				break;
			
				case 5:
				double cel;
				cel = displayC();
				JOptionPane.showMessageDialog(null, "Celsius: " + cel);
				break;
			
				case 6:
				displayBud();
				JOptionPane.showMessageDialog(null, "Your Budget Cost was saved to your computer.");
				
				break;

				default:
				JOptionPane.showMessageDialog(null, "You entered an invalid number, try again");
				
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
	
	public static double displayCent()
	{
			double inches;
			double cent;
			String inche;
			inche = JOptionPane.showInputDialog("How many inches");
			
			inches = Double.parseDouble(inche);
		
			return cent = inches * 2.54;
	}

	public static double displayFeet()
	{
			double inche;
			double feet;
			String inches;
			inches = JOptionPane.showInputDialog("How many inches");
			
			inche = Double.parseDouble(inches);

			return feet = inche * 12;
	}

	public static double displayC()
	{

			double fah;
			double c;
			String f;
			f = JOptionPane.showInputDialog("What's the Fahrenheit: ");
			
			fah = Double.parseDouble(f);
	
			return c = (fah - 32) * 5/9;
	}

	public static void displayBud() throws IOException
	{
			String material = JOptionPane.showInputDialog("Material Cost: ");
			String labor = JOptionPane.showInputDialog("Labor Cost: ");
			String time = JOptionPane.showInputDialog("Time on Job: ");

			PrintWriter outputFile = new PrintWriter("Client_Budget.txt");
			outputFile.println(material);
			outputFile.println(labor);
			outputFile.println(time);
			outputFile.close();
	}			


}
						

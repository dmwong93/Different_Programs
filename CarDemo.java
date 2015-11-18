import javax.swing.JOptionPane;

public class CarDemo
{
	public static void main(String[ ] args)
	{
		String make;
		String color;
		String price;
		double truePrice;
		
		make = JOptionPane.showInputDialog("Enter the make of your car: ");
		String mMake = CarType.valueOf(make);
		
		color = JOptionPane.showInputDialog("Enter the color of your car: ");
		String cColor = CarColor.valueOf(color);

		price = JOptionPane.showInputDialog("Enter the price of your car: ");

		truePrice = Double.parseDouble(price);

		Car myCar = new Car(CarType.mMake, CarColo.cColor, 10000);
	
		System.out.println(myCar);		
	}
}		

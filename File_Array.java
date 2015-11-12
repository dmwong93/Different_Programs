import java.util.Arrays;

public class File_Array
{
	//Private Field to hold the array.

	private double[] values;
	private double highestValue;
	private double lowestValue;
	/**
	   Constructor accepts the values passed from the 
	   object as an argument.
	*/
	
	public File_Array(double[] values)
	{
		this.values = values;
		highestValue = 0.0;
		lowestValue = 0.0;
	}

  
	/**
	   This method will add all the values and return them
	*/

	public double sum()
	{
		double total = 0.0;
		//Adding the values together using a for loop.

		for(int i = 0; i < values.length; i++)
			total += values[i];
		
		//returning the sum
		return total;
	}

	/** This method adds all the values and averages them.
	*/

	public double average()
	{
		return sum() / values.length;
	}

	/** This method find the highest value inside the array
	*/
	
	public double highestValue()
	{
			
		int i = 0;
		highestValue = values[i];
	
		for (int j = 1; j < values.length; j++)
			if (highestValue < values[j])
			{
				highestValue = values[j];
			}

		return highestValue;
	}
	
	/** This method finds the lowest value inside the array.
	*/
	
	public double lowestValue()
	{
		lowestValue = values[0];

		for (int j = 1; j < values.length; j++)
			if (lowestValue > values[j])
			{
				lowestValue = values[j];
			}
		return lowestValue;
	}
}

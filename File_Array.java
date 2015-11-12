public class File_Array
{
	//Private Field to hold the array.

	private double[] values;
	private double total;
	private double average;
	private double highestValue;
	private double lowestValue;

	/**
	   Constructor accepts the values passed from the 
	   object as an argument.
	*/
	
	public File_Array(double[] values)
	{
		this.values = new double[values.length];

		for (int index = 0; index < values.length; index++)
		{
			values[index] = values[index];
		}
		
		double total = 0.0;
		double average = 0.0;
		double highestValue = 0.0;
		double lowestValue = 0.0;
	}
  
	/**
	   This method will add all the values and return them
	*/

	public double sum()
	{
		
		//Adding the values together using a for loop.

		for(int i = 0; i < values.length; i++)
		{
			total += values[i];
		}
		
		//returning the sum
		return total;
	}

	/**
	   This is a toString method to display the values from the File.
	*/
	
	public String toString()
	{
		//Display all the values
		String str = "These are all the values entered: " + values;

		return str;
	}

	/** This method adds all the values and averages them.
	*/

	public double average()
	{
		double averageSum;

		averageSum = total / values.length;
		return averageSum;
	}

	/** This method find the highest value inside the array
	*/
	
	public double highestValue()
	{
			
		int i = 0;
		highestValue = values[i];
	
		for (int j = 1; j < values.length; j++)
			if (highestValue > values[j])
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
			if (lowestValue < values[j])
			{
				lowestValue = values[j];
			}
		return lowestValue;
	}
}

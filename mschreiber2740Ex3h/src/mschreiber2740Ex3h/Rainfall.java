package mschreiber2740Ex3h;

public class Rainfall {
	
	private double [] rainfallArray;
	
	
	
			
	//constructor for double array
	public Rainfall(double [] dr) {
		this.rainfallArray = new double [dr.length];
		for (int i = 0; i < dr.length; i++)
			this.rainfallArray[i] = dr [i];
	}

	//constructor for string array
	public Rainfall(String [] strRa) {
		this.rainfallArray = new double [strRa.length];
		for (int i = 0; i < strRa.length; i++)
			this.rainfallArray[i] = Double.parseDouble(strRa[i]);
	}
	
	//calculates the total of all array items
	public double getTotal()
	{
		double total = 0.0;
		for (double value : rainfallArray)
			total += value;
		return total;
	}
	
	//calculates the average of the array items
	public double getAverage()
	{		
		return getTotal() / rainfallArray.length;
	}
	
	//get the highest value in the array
	
	public double getHighest()
	{
		double highest = rainfallArray[0];
		for(int index = 1; index < rainfallArray.length; index++)
		{
			if (rainfallArray[index] > highest)
				highest = rainfallArray[index];
		
		}
		return highest;
	}
	
	//get the lowest value in the array
	public double getLowest()
	{
		double lowest = rainfallArray[0];
		for(int index = 1; index < rainfallArray.length; index++)
		{
			if (rainfallArray[index] < lowest)
				lowest = rainfallArray[index];
		
		}
		return lowest;
	}

}

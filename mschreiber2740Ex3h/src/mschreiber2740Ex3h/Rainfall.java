package mschreiber2740Ex3h;

public class Rainfall {
	
	private double [] rainfall;
	private String [] strRainfall;
	
	
			
	//constructor for double array
	public Rainfall(double [] rainfall) {
		this.rainfall = new double [rainfall.length];
		for (int i = 0; i < rainfall.length; i++)
			rainfall[i] = rainfall [i];
	}

	//constructor for string array
	public Rainfall(String [] strRainfall) {
		this.strRainfall = new String [strRainfall.length];
		for (int i = 0; i < strRainfall.length; i++)
			strRainfall[i] =(strRainfall[i]);
	}
	
	//calculates the total of all array items
	public double getTotal()
	{
		double total = 0.0;
		for (double value : rainfall)
			total += value;
		return total;
	}
	
	//calculates the average of the array items
	public double getAverage()
	{
		
		return getTotal() / rainfall.length;
	}
	
	//get the highest value in the array
	//FINISH METHODS STARTING HERE.... STILL DONT UNDERSTAND THE CONSTRUCTORS YET
	public double getHighest()
	{
		double highest = 0.0;
		
		return highest;
	}
	
	//get the lowest value in the array
	public double getLowest()
	{
		double lowest = 0.0;
		return lowest;
	}

}

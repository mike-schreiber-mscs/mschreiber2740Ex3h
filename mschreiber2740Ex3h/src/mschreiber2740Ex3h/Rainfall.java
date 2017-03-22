package mschreiber2740Ex3h;

public class Rainfall {
	
	private double [] rainfall;
	
	
	
			
	//constructor for double array
	public Rainfall(double [] dr) {
		this.rainfall = new double [dr.length];
		for (int i = 0; i < dr.length; i++)
			this.rainfall[i] = dr [i];
	}

	//constructor for string array
	public Rainfall(String [] strDr) {
		this.rainfall = new double [strDr.length];
		for (int i = 0; i < strDr.length; i++)
			this.rainfall[i] = Double.parseDouble(strDr[i]);
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
	//FINISH METHODS STARTING 
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

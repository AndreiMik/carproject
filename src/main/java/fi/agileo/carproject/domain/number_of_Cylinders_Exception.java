package fi.agileo.carproject.domain;

public class number_of_Cylinders_Exception extends Exception {

	private static final long serialVersionUID = 3266628400337239661L;
	
	public String getMessage()
	{		
		return "'Too much of broken cylinders' exception";
	}
	
 // what is this? how it works?
 /*
	public String toString()
	{
		return "overSpeed Exception";
	}
	*/

}

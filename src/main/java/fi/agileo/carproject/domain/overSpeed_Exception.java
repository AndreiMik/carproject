package fi.agileo.carproject.domain;

public class overSpeed_Exception extends Exception 
{
	private static final long serialVersionUID = -4186810868153785415L;// what is this? how it works?


	public String getMessage()
	{		
		return "'Over speed' exception";
	}
	
 // what is this? how it works?
 
	public String toString()
	{
		return "Over Speed Exception";
	}
	
}

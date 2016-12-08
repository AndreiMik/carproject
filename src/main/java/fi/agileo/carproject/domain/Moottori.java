package fi.agileo.carproject.domain;

public class Moottori
{
	private double teho;
	private int sylinterienMaara;
	private int sylintereitaRikki;
	
	public Moottori(){} // empty constructor
	
	public Moottori(double t, int SylNum, int SylBrok) // constructor
	{
		teho = t;
		sylinterienMaara = SylNum;
		sylintereitaRikki = SylBrok;
	}

	public double getTeho() {
		return teho;
	}

	public void setTeho(double teho) {
		this.teho = teho;
	}

	public int getSylinterienMaara() {
		return sylinterienMaara;
	}

	public void setSylinterienMaara(int sylinterienMaara) {
		this.sylinterienMaara = sylinterienMaara;
	}

	public int getSylintereitaRikki() {
		return sylintereitaRikki;
	}

	public void setSylintereitaRikki(int sylintereitaRikki) {
		this.sylintereitaRikki = sylintereitaRikki;
	}
	
	// harjoitus 4 b) metodi "menerikki()"
	
	public int getmeneRikki() throws number_of_Cylinders_Exception
	{
		int random = (int) Math.random();
		
		int sylintereitaRikki = 1 + random*(sylinterienMaara - this.sylintereitaRikki);
		
//		sylintereitaRikki = 10; // just to call exception
		
		if(sylintereitaRikki >sylinterienMaara)
		{
			throw new number_of_Cylinders_Exception();
		}
		
		return sylintereitaRikki;
	}
			
	public void too_much_of_broken_cylinders(int total_cylinders, int broken_cylinders) throws number_of_Cylinders_Exception // just for Moottori_test class
	{
		if (broken_cylinders>total_cylinders)
		{			
			throw new number_of_Cylinders_Exception();
		}			
	}	
	
}

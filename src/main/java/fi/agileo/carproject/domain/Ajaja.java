package fi.agileo.carproject.domain;

public class Ajaja 
{
	private Auto auto;
	private String nimi;
	private  Ajotapa ajotapa;
	
	public Ajaja () {} // empty constructor
	
	public Ajaja (Auto ao, String n, Ajotapa ajotapa) // constructor
	{
		auto = ao;
		nimi = n;
		this.ajotapa = ajotapa;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

		
	// Harjoitus 4 a) "aja" metodi
	
	public Ajotapa getAjotapa() {
		return ajotapa;
	}

	public void setAjotapa(Ajotapa ajotapa) {
		this.ajotapa = ajotapa;
	}

	public double getAja(double tuntia) throws result_of_aja_Exception
	{
		double aja = 0;
		try {
			aja = auto.getLaskettuNopeus()*tuntia* ajotapa.kerroin;
		} catch (overSpeed_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		aja = -100; // just to call exception
		
		if(aja <0)
		{
			throw new result_of_aja_Exception();
		}
		
		return aja;
	}
	
	public enum Ajotapa 
	{
		AGGRESSIIVINEN(1.0), TAVALLINEN(0.7), RAUHALLINEN(0.4);
		
		private final double kerroin;
		
		Ajotapa (double kerroin)
		{
			this.kerroin = kerroin;
		}
	}
	
	public double aja(double tuntia)
	{
		
		if (tuntia < 0.0)
		{
			return 0.0;
		}
		double paluuArvo;
		
		paluuArvo = auto.getHuippunopeus() * tuntia * ajotapa.kerroin;
		
		return paluuArvo;
	}
	
	
	public void exception_call_for_aja(double aja) throws result_of_aja_Exception // just for Ajaja_test class
	{
		if (aja<0)
		{			
			throw new result_of_aja_Exception();
		}			
	}	
	
}

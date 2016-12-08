package fi.agileo.carproject.domain;


public class Auto
{
	private String merkki;
	private String malli;
	private double huippunopeus;
	private Moottori moottori;
	private Ajaja ajaja;
		
	public Auto(){} // empty construtor
	
	public Auto(String mer, String mal, double nop, Moottori moot, Ajaja aja ) // constructor
	{
		merkki = mer;
		malli = mal;
		huippunopeus = nop;
		moottori = moot;
		ajaja = aja;			
	}
	
	public String getMerkki() {
		return merkki;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public String getMalli() {
		return malli;
	}

	public void setMalli(String malli) {
		this.malli = malli;
	}

	public double getHuippunopeus() {
		return this.huippunopeus;
	}

	public void setHuippunopeus(double huippunopeus) {
		this.huippunopeus = huippunopeus;
	}

	public Moottori getMoottori() {
		return moottori;
	}

	public void setMoottori(Moottori moottori) {
		this.moottori = moottori;
	}

	public Ajaja getAjaja() {
		return ajaja;
	}

	public void setAjaja(Ajaja ajaja) {
		this.ajaja = ajaja;
	}
	
	// Harjoitus 4 c) metodi laskeNopeus()
	
	public double getLaskettuNopeus() throws overSpeed_Exception
	{
		double laskettunopeus = ((moottori.getSylinterienMaara() - moottori.getSylintereitaRikki())*huippunopeus)/moottori.getSylinterienMaara();
		
		
		laskettunopeus = 300; // just to call exception 		
		
		if(laskettunopeus >getHuippunopeus())
		{
			throw new overSpeed_Exception();
		}
		
		return laskettunopeus;
	}
	
	public void overSpeed(double speed, double topSpeed) throws overSpeed_Exception // just for Auto_test class
	{
		if (speed>topSpeed)
		{			
			throw new overSpeed_Exception();
		}			
	}	
}

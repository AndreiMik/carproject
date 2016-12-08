package fi.agileo.carproject;
import java.util.Scanner;

import fi.agileo.carproject.domain.Ajaja;
import fi.agileo.carproject.domain.Ajaja.Ajotapa;
import fi.agileo.carproject.domain.Auto;
import fi.agileo.carproject.domain.Moottori;
import fi.agileo.carproject.domain.number_of_Cylinders_Exception;
import fi.agileo.carproject.domain.overSpeed_Exception;
import fi.agileo.carproject.domain.result_of_aja_Exception;

public class App 
{

	public static void main(String[] args) throws overSpeed_Exception, number_of_Cylinders_Exception, result_of_aja_Exception
	{
		Ajaja ajaja1 = new Ajaja();
		Ajaja ajaja2 = new Ajaja();
		Ajaja ajaja3 = new Ajaja();
		
		Moottori moottori1 = new Moottori();
		Moottori moottori2 = new Moottori();
		Moottori moottori3 = new Moottori();
		
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto();

		auto1 = new Auto("Toyota", "Corolla", 180.5, moottori1, ajaja1); // parametreja
		auto2 = new Auto("Volksvagen", "Golf", 170.3, moottori2, ajaja2); // parametreja
		auto3 = new Auto("Ford", "Escort", 173.7, moottori3, ajaja3); // parametreja
		
		moottori1 = new Moottori(90, 4, 0);
		moottori2 = new Moottori(80, 4, 0);
		moottori3 = new Moottori(85, 4, 0);
		
		ajaja1 = new Ajaja(auto1, "Hakkinen", Ajotapa.AGGRESSIIVINEN);
		ajaja2 = new Ajaja(auto2, "Raikkonen", Ajotapa.TAVALLINEN);
		ajaja3 = new Ajaja(auto3, "Kovalainen", Ajotapa.RAUHALLINEN);
		
		
		// Harjoituksia
		
		double tuntia = 0;
		
		Moottori moottori [] = {moottori1, moottori2, moottori3};
		
		double laskettunopeus [] = new double [3];
		
		System.out.print("Enter driving time:  ");
		
		Scanner reader = new Scanner(System.in);
		
		tuntia = reader.nextDouble();	
		
		reader.close();
		
		System.out.print("    Ok. Driving time is    ");
		
		System.out.print(tuntia);	
		
		System.out.println("   hours   ");
		
		System.out.println("Lasketaan...");
		
		System.out.println("");
		
		// Harjoitus 4 b) calculation of number of broken cylinders
		
		System.out.println("Harjoitus 4 b) calculation of number of broken cylinders");
		
		System.out.println("");	
						
		for(int i=0; i<moottori.length; i++)
			{				
				System.out.print("Car number ");
				
				System.out.print(i+1);			
				
				System.out.println("  meneRikki =  " + moottori[i].getmeneRikki());	
			}
		
		// Harjoitus 4 c) calculation of speed
		
		System.out.println("");
		
		System.out.println("Harjoitus 4 c) calculation of speed");
		
		System.out.println("");
		
		Auto auto [] = {auto1, auto2, auto3};
					
		for(int i=0; i<auto.length; i++)
		{
			laskettunopeus[i] = auto[i].getLaskettuNopeus();
						
			System.out.print("Car number ");
			
			System.out.print(i+1);			
			
			System.out.println("  laskettu nopeus =  " + auto[i].getLaskettuNopeus());	
		}	
		
		// Harjoitus 4 a)  lasketaan ajo
		
		System.out.println("");
		
		System.out.println("Harjoitus 4 a)  lasketaan ajo");
		
		System.out.println("");
		
		double ajo [] = new double [3];	
		
		Ajaja ajaja [] = {ajaja1, ajaja2, ajaja3};				
		
		for(int i=0; i<ajo.length; i++)
		{
			ajo[i] = ajaja[i].getAja(laskettunopeus[i]);	
			
			System.out.print("Car number ");
			
			System.out.print(i+1);			
			
			System.out.println("  ajo =  " +ajo[i]);			
		}	
	}
}

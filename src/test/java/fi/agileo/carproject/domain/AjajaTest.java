package fi.agileo.carproject.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import fi.agileo.carproject.domain.Ajaja.Ajotapa;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)

public class AjajaTest {
	
	@Mock
	Auto mockAuto;
	
	@Before
	public void setUp()
	{
		when(mockAuto.getHuippunopeus()).thenReturn(100.0);
		
		
	}

	@Test
	public void testAja() 
	{
		Ajaja testattava = new Ajaja(mockAuto, "Spede Pasanen", Ajotapa.TAVALLINEN);
		
		assertEquals(0.01, testattava.aja(0.0001), 0.0001);
		assertEquals(50, testattava.aja(0.5), 0.0001);
		assertEquals(100, testattava.aja(1.0), 0.0001);
		assertEquals(0, testattava.aja(-1.0), 0.0001);
		assertEquals(10000000, testattava.aja(100000), 0.0001);
		
	}
	
	@Test
	public void testAjaAggressivinen() 
	{
		Ajaja testattava = new Ajaja(mockAuto, "Matti Meik'l'inen", Ajotapa.AGGRESSIIVINEN);
		
		assertEquals(0.007, testattava.aja(0.0001), 0.0001);
		assertEquals(35, testattava.aja(0.5), 0.0001);
		assertEquals(70, testattava.aja(1.0), 0.0001);
		assertEquals(0, testattava.aja(-1.0), 0.0001);
		assertEquals(7000000, testattava.aja(100000), 0.0001);
		
	}

}

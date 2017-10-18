package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {
	private static AthleticGame aG;

	@BeforeClass
	public static void init(){
		aG = new AthleticGame("Lancio del giavelloto");
	}

	@Test
	public void addArrivalWorks(){
		aG.addArrival("Nessuno", Instant.now());
		Assert.assertEquals(1, aG.getArrivals().size());
	}

	@Test(expected=IllegalArgumentException.class)
	public void getParecipiantTimeWorks(){
		aG.getParecipiantTime("Ciao");
	}

}
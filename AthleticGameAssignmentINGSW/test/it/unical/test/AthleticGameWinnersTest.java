package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {

	private static AthleticGame aG;

	@BeforeClass
	public static void init(){
		aG = new AthleticGame("Lancio del giavelloto");
	}

	@After
	public void resetWorks(){
		aG.reset();
	}

	@Before
	public void startWorks(){
		aG.start();
	}

	@Test
	public void getWinnerFirstWorks(){
		aG.addArrival("Ciccio", Instant.now().plusMillis(1000));
		aG.addArrival("Pasticcio", Instant.now().plusMillis(1500));
		aG.addArrival("Renata", Instant.now().plusMillis(500));
		aG.addArrival("L'imbranata", Instant.now().plusMillis(2500));

		Assert.assertEquals("Renata"
				+ "", aG.getWinner());
	}

	@Test
	public void getWinnerSecondWorks(){
		aG.addArrival("Pasticcio", Instant.now().plusMillis(1000));
		Assert.assertEquals("Pasticcio", aG.getWinner());
	}

}

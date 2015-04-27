package net.franck.benault.system.oldfashion.testing;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import net.franck.benault.sample.Hello;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SystemOutErrTestCase {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
		Hello hello = new Hello();
		hello.error();
	    System.setErr(null);
	}


	@Test
	public void testOut() {
	    new Hello();
	    assertEquals("Hello", outContent.toString());
	}

	@Test
	public void err() {
		Hello hello = new Hello();
		hello.error(); 
	    assertEquals("error...", errContent.toString());
	}

}

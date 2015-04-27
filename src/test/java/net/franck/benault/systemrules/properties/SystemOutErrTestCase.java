package net.franck.benault.systemrules.properties;

import static org.junit.Assert.*;
import net.franck.benault.sample.Hello;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardErrorStreamLog;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

public class SystemOutErrTestCase {
	
	@Rule
	public final StandardOutputStreamLog logOut = new StandardOutputStreamLog();

	@Rule
	public final StandardErrorStreamLog logError = new StandardErrorStreamLog();

	
	@Test
	public void testOut() {
	    new Hello();
	    assertEquals("Hello", logOut.getLog());
	}

	@Test
	public void err() {
		Hello hello = new Hello();
		hello.error(); 
	    assertEquals("error...", logError.getLog());
	}

}

package net.franck.benault.systemrules.properties;

import static org.junit.Assert.assertEquals;
import net.franck.benault.sample.Hello;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.SystemErrRule;

public class SystemOutErrV2TestCase {
	
	@Rule
	public final SystemOutRule logOut = new SystemOutRule().enableLog().mute();

	@Rule
	public final SystemErrRule logError = new SystemErrRule().enableLog().mute();

	
	@Test
	public void testOut() {
	    new Hello();
	    assertEquals("Hello", logOut.getLog());
	    logOut.clearLog();
	    assertEquals("",logOut.getLog());
	    new Hello("Bob");
	    assertEquals("Hello Bob", logOut.getLog());	    
	}

	@Test
	public void err() {
		Hello hello = new Hello();
		hello.error(); 
	    assertEquals("error...", logError.getLog());
	    logError.clearLog();
	    assertEquals("",logError.getLog());
	    hello.error("Bob"); 
	    assertEquals("error Bob", logError.getLog());
	}

}

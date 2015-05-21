package net.franck.benault.systemrules.properties;

import static org.junit.Assert.*;
import net.franck.benault.sample.Hello;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class SystemOutErrTestCase {
	
	@Rule
	public final SystemOutRule logOut = new SystemOutRule().enableLog();

	@Rule
	public final SystemErrRule logError = new SystemErrRule().enableLog();

	
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

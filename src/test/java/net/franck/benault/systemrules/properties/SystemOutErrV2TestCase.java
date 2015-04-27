package net.franck.benault.systemrules.properties;

import static org.junit.Assert.assertEquals;
import net.franck.benault.sample.Hello;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.LogMode;
import org.junit.contrib.java.lang.system.StandardErrorStreamLog;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

public class SystemOutErrV2TestCase {
	
	@Rule
	public final StandardOutputStreamLog logOut = new StandardOutputStreamLog(LogMode.LOG_ONLY);

	@Rule
	public final StandardErrorStreamLog logError = new StandardErrorStreamLog(LogMode.LOG_ONLY);

	
	@Test
	public void testOut() {
	    new Hello();
	    assertEquals("Hello", logOut.getLog());
	    logOut.clear();
	    assertEquals("",logOut.getLog());
	    new Hello("Bob");
	    assertEquals("Hello Bob", logOut.getLog());	    
	}

	@Test
	public void err() {
		Hello hello = new Hello();
		hello.error(); 
	    assertEquals("error...", logError.getLog());
	    logError.clear();
	    assertEquals("",logError.getLog());
	    hello.error("Bob"); 
	    assertEquals("error Bob", logError.getLog());
	}

}

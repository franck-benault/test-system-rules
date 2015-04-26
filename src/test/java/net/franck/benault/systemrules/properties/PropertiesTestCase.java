package net.franck.benault.systemrules.properties;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ClearSystemProperties;


public class PropertiesTestCase {
	
	
	@Rule
	public final ClearSystemProperties myPropertyIsClear = new ClearSystemProperties("thePropertiesIsClear");
	

	@Test
	public void test() {
		assertNull(System.getProperty("thePropertiesIsClear"));
	}

}

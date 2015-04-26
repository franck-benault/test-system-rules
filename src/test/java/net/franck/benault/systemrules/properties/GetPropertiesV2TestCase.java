package net.franck.benault.systemrules.properties;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ClearSystemProperties;
import org.junit.contrib.java.lang.system.ProvideSystemProperty;


public class GetPropertiesV2TestCase {
	
	
	@Rule
	public final ProvideSystemProperty myProperty1 = new ProvideSystemProperty("theProperty1", "value1");
	

	
	@Test
	public void testSystemGetPropertyIsEmpty() {
		assertEquals(System.getProperty("theProperty1"), "value1");
		
	}

}

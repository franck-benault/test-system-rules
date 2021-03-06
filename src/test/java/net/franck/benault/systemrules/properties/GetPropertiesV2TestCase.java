package net.franck.benault.systemrules.properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ProvideSystemProperty;


public class GetPropertiesV2TestCase {
	
	
	@Rule
	public final ProvideSystemProperty myProperty1 = new ProvideSystemProperty("theProperty1", "value1");
	
	@Rule
	public final ProvideSystemProperty myProperty2 = new ProvideSystemProperty("theProperty2", null);

	
	@Test
	public void testSystemGetProperty1() {
		assertEquals(System.getProperty("theProperty1"), "value1");
		
	}

	@Test
	public void testSystemGetProperty2() {
		assertNull(System.getProperty("theProperty2"));
		
	}
}

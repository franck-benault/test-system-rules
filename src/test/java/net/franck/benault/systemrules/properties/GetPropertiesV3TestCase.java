package net.franck.benault.systemrules.properties;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ProvideSystemProperty;


public class GetPropertiesV3TestCase {
	
	
	@Rule
	public final ProvideSystemProperty myProperty1 = new ProvideSystemProperty("theProperty1", "value1").and("theProperty2", null);

	
	@Test
	public void testSystemGetProperty1() {
		assertEquals(System.getProperty("theProperty1"), "value1");
		
	}

	@Test
	public void testSystemGetProperty2() {
		assertNull(System.getProperty("theProperty2"));
		
	}
}

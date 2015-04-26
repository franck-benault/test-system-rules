package net.franck.benault.systemrules.properties;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ClearSystemProperties;


public class PropertiesTestCase {
	
	
	@Rule
	public final ClearSystemProperties myPropertyIsClear = new ClearSystemProperties("thePropertiesIsClear");
	

	@Test
	public void testExistingSystemProperties() {
		assertNotNull("file.separator");
		assertNotNull("java.class.path");
		assertNotNull("java.home");
		assertNotNull("java.vendor");
		assertNotNull("java.vendor.url");
		assertNotNull("java.version");
		assertNotNull("line.separator");
		assertNotNull("os.arch");
		assertNotNull("os.name");
		assertNotNull("os.version");
		assertNotNull("path.separator");
		assertNotNull("user.dir");
		assertNotNull("user.home");
		assertNotNull("user.name");
		
		
	}
	
	@Test
	public void testSystemGetPropertyIsEmpty() {
		assertNull(System.getProperty("thePropertiesIsClear"));
		
	}

}

package net.franck.benault.systemrules.properties;

import net.franck.benault.sample.AppWithExit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

public class AppWithExitTest {

	@Rule
	public final ExpectedSystemExit exit = ExpectedSystemExit.none();

	@Test
	public void testExits() {
		exit.expectSystemExit();
		AppWithExit.doSomethingAndExit();
	}

	@Test
	public void testExitsWithStatusCode1() {
		exit.expectSystemExitWithStatus(1);
		AppWithExit.doSomethingAndExit();
	}

	@Test
	public void testNoSystemExit() {
		AppWithExit.doNothing();
		// passes
	}
}

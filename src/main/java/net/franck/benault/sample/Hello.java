package net.franck.benault.sample;

public class Hello {

	public Hello() {
		System.out.print("Hello");
	}
	
	public Hello(String message) {
		System.out.print("Hello "+message);
	}
	
	public void error() {
		System.err.print("error...");
	}
	
	public void error(String message) {
		System.err.print("error "+message);
	}
}

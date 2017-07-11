package com.adapter;

public class SocketObjectAdapterImlp implements SocketAdapter {

	// Using Composition for adapter pattern

	private Socket sock = new Socket();

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}

	public Volt get120Volt() {
		return sock.getVolt();
	}

	public Volt get12Volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 10);
	}
	
	public Volt get3Volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 40);
	}

}

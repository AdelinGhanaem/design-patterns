package com.builder;

public class Demo {

	public static void main(String[] args) {
		
		Computer comp = new Computer.ComputerBuilder("333 GB", "2 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
		System.out.println(comp);
	}
}

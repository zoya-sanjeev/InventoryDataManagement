package com.bridgelabz.inventorymanagement;

public class InventoryMain {

	public static void main(String[] args) {
		Inventory rice=new Inventory("Rice",40.5, 38.8);
		Inventory wheat=new Inventory("Wheat",23.6, 17.5);
		Inventory pulses=new Inventory("Rice",10.4, 30.5);
		
		System.out.println("Value of total "+rice.getName()+" is "+rice.calculatePrice());
		System.out.println("Value of total "+wheat.getName()+" is "+wheat.calculatePrice());
		System.out.println("Value of total "+pulses.getName()+" is "+pulses.calculatePrice());
		
	}

}

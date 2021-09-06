package com.bridgelabz.inventorymanagement;

public class InventoryFactory {
	
	public Inventory createInventory(String name) {
		if(name.equalsIgnoreCase("rice"))
			return new Inventory("Rice",40.5, 38.8);
		if(name.equalsIgnoreCase("wheat"))
			return new Inventory("Wheat",40.5, 38.8);
		if(name.equalsIgnoreCase("Pulses"))
			return new Inventory("pulses",40.5, 38.8);
		return null;
	}

}

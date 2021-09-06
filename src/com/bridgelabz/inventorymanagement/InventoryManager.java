package com.bridgelabz.inventorymanagement;

import java.util.Scanner;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.LinkedList;
import com.bridgelabz.linkedlist.MyNode;

public class InventoryManager {
	static Scanner scanner =new Scanner(System.in);
	
	static LinkedList<Inventory> inventoryList=new LinkedList<>();
	static InventoryFactory inventoryFactory=new InventoryFactory();
	
	
	public static void addInventory(int number) {
		
		for(int count=0;count<number;count++) {
			
			System.out.println("Enter name of inventory item");
			String itemName=scanner.next();
			Inventory item=inventoryFactory.createInventory(itemName);
			inventoryList.add(new MyNode(item));
		}
	
		
	}
	public static void showPrice() {
			INode node=inventoryList.getHead();
			while(node!=null) {
				Inventory item=(Inventory) node.getKey();
				System.out.println(item.getName());
				System.out.println("Price:"+item.calculatePrice());
				node=node.getNext();
			}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter number of items");
		int numberOfItems=Integer.parseInt(scanner.next());
		addInventory(numberOfItems);
		showPrice();
		
		
	}

}

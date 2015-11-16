package edu.towson.CS436.rsussan.Back_End;

/**
 * System Interface.
 * Works out everything that the user interface needs done.
 * All methods return an array of strings to the UI.
 * 
 * (All static methods maybe???)
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.MenuIterator;

public class System_Interface {
	private static Invoker invoker;
	
	public static String[] getMenu(){
		Menu menu = invoker.getMenu();
		
		MenuIterator itr = menu.getMenuIterator();
		
		String[] str = new String[100];
		
		
		
		
		
		
		while(true){
			break;
		}
		return str;
	}
}

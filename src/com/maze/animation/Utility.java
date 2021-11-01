package com.maze.animation;

import java.io.IOException;

public class Utility {
	public static void clearScreen() {
		//Untuk Clear Screen nya
		try {
			if(System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		}catch (IOException | InterruptedException ex) {}
	}
	
public static void delay(long milisecond) {
	//untuk delay nampilin output
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
	
}

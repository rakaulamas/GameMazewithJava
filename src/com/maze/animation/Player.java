package com.maze.animation;

public class Player {
	
	String bentuk = "x";
	private int coordX = 1;
	private int coordY = 1;
	
	 public Player(String bentuk, int coordX, int coordY) {
		this.bentuk=bentuk;
		this.coordX = coordX;
		this.coordY = coordY;
	 }

	 
	 public Player() {
		 
	 }
	 
	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}


	public String getBentuk() {
		return bentuk;
	}


	public void setBentuk(String bentuk) {
		this.bentuk = bentuk;
	}
	
	public void moveUp() {
		this.coordY--;
	}
	
	public void moveDown() {
		this.coordY++;
	}
	
	public void moveRight() {
		this.coordX++;
	}
	
	
	public void moveLeft() {
		this.coordX--;
	}
	
}

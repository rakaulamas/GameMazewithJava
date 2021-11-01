package com.maze.controller;

import java.util.Scanner;

import com.maze.animation.Labirin;
import com.maze.animation.Player;

public class Controller {
	
	Player player;
	Labirin labirin;
	String gerak = "";
	
	public Controller() {			//set/gerakin dari dalam
		this.player = new Player("0",5,10);
		this.labirin = new Labirin(15,player);
		
	}
	
	public Controller(Player player, Labirin labirin) {			//set/gerakin dari luar
		this.player = player;
		this.labirin = labirin;
		
		
		
	}		
	
	
	 public void start() {
		 
		 
		 do {
			labirin.draw();
			System.out.println("Gerakan Player(A/S/W/D): ");
			Scanner scan = new Scanner(System.in);
			gerak = scan.next().toUpperCase();
			playerMovement(gerak);
		 }
		 	while(!gerak.equalsIgnoreCase("X"));
		 		
		 }
	 
	 private void playerMovement(String gerak) {
		 switch (gerak) {
		case "A":
			if(labirin.getPlayer().getCoordX() > 1) {
			labirin.getPlayer().moveLeft();
			}else {
				checkGame();
			}
			break;
			
			
		case "D":
			if(labirin.getPlayer().getCoordX() < labirin.getDefaultSizeRuangan()-2) {
			labirin.getPlayer().moveRight();
			}else {
				checkGame();
			}
			break;
			
		case "W":
			if(labirin.getPlayer().getCoordY()>1) {
			labirin.getPlayer().moveUp();
			}else {
				checkGame();
			}
			break;
			
		case "S":
			if(labirin.getPlayer().getCoordY() < labirin.getDefaultSizeRuangan()-2) {
			labirin.getPlayer().moveDown();
			}else {
				checkGame();
			}
			break;

		default:
			break;
		}
	 }

	 private void checkGame() {
		 if(labirin.getPlayer().getCoordX() == labirin.getDefaultSizeRuangan()-2 && labirin.getPlayer().getCoordY() == labirin.getDefaultSizeRuangan()-2){
			 System.out.println("-----Anda Menang!-----");
			 this.gerak= "X";
		 	}
	 	}
	 
	 
	 
}
	
	


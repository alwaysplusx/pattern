package org.moon.pattern.flyweight.example1;

public class Client {

	public static void main(String[] args) {
		ChessmanFactory factory = ChessmanFactory.getInstance();
		
		Chessman chessman1 = factory.getChessman("white");
		Chessman chessman2 = factory.getChessman("white");		
		Chessman chessman3 = factory.getChessman("white");
		Chessman chessman4 = factory.getChessman("white");
		
		Chessman chessman5 = factory.getChessman("block");
		Chessman chessman6 = factory.getChessman("block");
		Chessman chessman7 = factory.getChessman("block");
		Chessman chessman8 = factory.getChessman("block");
		
		chessman1.display(new Coordinates(1, 3));
		chessman2.display(new Coordinates(1, 3));
		chessman3.display(new Coordinates(1, 3));
		chessman4.display(new Coordinates(1, 3));
		chessman5.display(new Coordinates(1, 3));
		chessman6.display(new Coordinates(1, 3));
		chessman7.display(new Coordinates(1, 3));
		chessman8.display(new Coordinates(1, 3));
		
	}
	
}

package org.moon.pattern.flyweight.example1;

import java.util.HashMap;
import java.util.Map;

import org.moon.pattern.flyweight.example1.impl.BlockChessman;
import org.moon.pattern.flyweight.example1.impl.WhiteChessman;

public class ChessmanFactory {

	private static ChessmanFactory me = new ChessmanFactory();
	private Map<String, Chessman> chessmanMap = new HashMap<String, Chessman>();

	private ChessmanFactory() {
		chessmanMap.put("white", new WhiteChessman());
		chessmanMap.put("block", new BlockChessman());
	}

	public static ChessmanFactory getInstance() {
		return me;
	}

	public Chessman getChessman(String color) {
		return chessmanMap.get(color);
	}

}

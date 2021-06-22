package GameStore.entities.concrete;

import GameStore.entities.Abstract.Entity;

public class Game implements Entity{
	
	private int gameId;
	private String gameName;
	private String publisher;
	private int price;
	private String storeName;
	public Game() {
		
	}
	public Game(Store store,int gameId, String gameName, String publisher, int price) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.publisher = publisher;
		this.price = price;
		this.storeName= store.getFirmName();
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}

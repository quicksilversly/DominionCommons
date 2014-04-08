package com.xalero.dominion.commons.protocol.dtos;

public class BuyCardDto {
	private String cardName;
	private PlayerGameDto playerGameDto;
	
	public BuyCardDto(String cardName, PlayerGameDto playerGameDto) {
		this.cardName = cardName;
		this.playerGameDto = playerGameDto;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String getCardName() {
		return cardName;
	}
	
	public void setPlayerGameDto(PlayerGameDto playerGameDto) {
		this.playerGameDto = playerGameDto;
	}
	
	public PlayerGameDto getPlayerGameDto() {
		return playerGameDto;
	}
}

package com.xalero.dominion.commons.protocol.dtos;

import java.util.Collection;
import java.util.List;

public class PlayCardDto {
	private String cardName;
	private PlayerGameDto playerGameDto;
	private List<String> parameters;
	
	public PlayCardDto(String cardName, PlayerGameDto playerGameDto, List<String> parameters) {
		this.cardName = cardName;
		this.playerGameDto = playerGameDto;
		this.parameters = parameters;
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
	
	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}
	
	public Collection<String> getParameters() {
		return parameters;
	}
}

package com.xalero.dominion.commons.protocol.dtos;

import java.util.List;

public class PlayCardDto {
	private String cardName;
	private long playerId;
	private List<String> parameters;
	
	public PlayCardDto(String cardName, long playerId, List<String> parameters) {
		this.cardName = cardName;
		this.playerId = playerId;
		this.parameters = parameters;
	}
	
	public String getCardName() {
		return cardName;
	}
	
	public long getPlayerId() {
		return playerId;
	}
	
	public List<String> getParameters() {
		return parameters;
	}
}

package com.xalero.dominion.commons.protocol.dtos;

public class PlayerIdDto {
	private long playerId;
	
	public PlayerIdDto(long playerId) {
		this.playerId = playerId;
	}
	
	public long getPlayerId() {
		return playerId;
	}
}

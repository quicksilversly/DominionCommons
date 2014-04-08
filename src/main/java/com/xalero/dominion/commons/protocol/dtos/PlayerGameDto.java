package com.xalero.dominion.commons.protocol.dtos;

public class PlayerGameDto {

	private PlayerDto playerDto;
	private Long gameId;
	
	public PlayerDto getPlayerDto() {
		return playerDto;
	}
	public void setPlayerDto(PlayerDto playerDto) {
		this.playerDto = playerDto;
	}
	public Long getGameId() {
		return gameId;
	}
	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}
}

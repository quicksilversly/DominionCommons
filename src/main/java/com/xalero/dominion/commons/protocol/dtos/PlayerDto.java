package com.xalero.dominion.commons.protocol.dtos;

import com.xalero.dominion.commons.model.PlayerType;

public class PlayerDto {

	private Long playerId;
    private String name;
    private PlayerType playerType;

    public void setPlayerId(Long playerId) {
    	this.playerId = playerId;
    }
    
    public Long getPlayerId() {
    	return playerId;
    }
    
    /**
     * @param name The name that will be displayed in the game
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the PlayerType: HUMAN or COMPUTER
     * 
     * @return human or computer
     */
    public PlayerType getPlayerType() {
        return playerType;
    }

    /**
     * Sets the player type of HUMAN or COMPUTER
     *
     * @param playerType
     */
    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xalero.dominion.commons.protocol.dtos;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author jonathan
 */
public class GameSettingsDto {
     
	private List<String> gameCards;
	private int numHumanPlayers;
	private int numCompPlayers;
    
    public Collection<String> getGameCards() {
        return gameCards;
    }    
    public void setGameCards(List<String> gameCards) {
        this.gameCards = gameCards;
    }
	public int getNumHumanPlayers() {
		return numHumanPlayers;
	}
	public void setNumHumanPlayers(int numHumanPlayers) {
		this.numHumanPlayers = numHumanPlayers;
	}
	public int getNumCompPlayers() {
		return numCompPlayers;
	}
	public void setNumCompPlayers(int numCompPlayers) {
		this.numCompPlayers = numCompPlayers;
	}
}

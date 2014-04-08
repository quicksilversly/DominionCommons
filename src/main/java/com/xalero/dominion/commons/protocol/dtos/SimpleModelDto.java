package com.xalero.dominion.commons.protocol.dtos;

import java.util.List;


public class SimpleModelDto {
	
	private SimpleTreasuresDto simpleTreasures;
	private SimpleVictoryCardsDto simpleVictoryCards;
	
	private List<SimpleKingdomCardDto> kingdomCards;
	private List<SimplePlayerDto> simplePlayers;
	
	private int curses;
	private int playerTurn;

    /**
     * @return the simpleTreasures
     */
    public SimpleTreasuresDto getSimpleTreasures() {
        return simpleTreasures;
    }

    /**
     * @param simpleTreasures the simpleTreasures to set
     */
    public void setSimpleTreasures(SimpleTreasuresDto simpleTreasures) {
        this.simpleTreasures = simpleTreasures;
    }

    /**
     * @return the simpleVictoryCards
     */
    public SimpleVictoryCardsDto getSimpleVictoryCards() {
        return simpleVictoryCards;
    }

    /**
     * @param simpleVictoryCards the simpleVictoryCards to set
     */
    public void setSimpleVictoryCards(SimpleVictoryCardsDto simpleVictoryCards) {
        this.simpleVictoryCards = simpleVictoryCards;
    }

    /**
     * @return the kingdomCards
     */
    public List<SimpleKingdomCardDto> getKingdomCards() {
        return kingdomCards;
    }

    /**
     * @param kingdomCards the kingdomCards to set
     */
    public void setKingdomCards(List<SimpleKingdomCardDto> kingdomCards) {
        this.kingdomCards = kingdomCards;
    }

    /**
     * @return the simplePlayers
     */
    public List<SimplePlayerDto> getSimplePlayers() {
        return simplePlayers;
    }

    /**
     * @param simplePlayers the simplePlayers to set
     */
    public void setSimplePlayers(List<SimplePlayerDto> simplePlayers) {
        this.simplePlayers = simplePlayers;
    }

    /**
     * @return the curses
     */
    public int getCurses() {
        return curses;
    }

    /**
     * @param curses the curses to set
     */
    public void setCurses(int curses) {
        this.curses = curses;
    }

    /**
     * @return the playerTurn
     */
    public int getPlayerTurn() {
        return playerTurn;
    }

    /**
     * @param playerTurn the playerTurn to set
     */
    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }

}

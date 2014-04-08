package com.xalero.dominion.commons.protocol.dtos;

import java.util.List;

public class SimpleSpecificPlayerDto {

    private SimplePlayerDto simplePlayerDto;

    private List<String> hand;
    private List<String> deck;
    private List<String> discardPile;
    private int money;

    /**
     * @return 
     */
    public SimplePlayerDto getSimplePlayerDto() {
        return simplePlayerDto;
    }

    /**
     * 
     * @param simplePlayerDto 
     */
    public void setSimplePlayerDto(SimplePlayerDto simplePlayerDto) {
        this.simplePlayerDto = simplePlayerDto;
    }

    /**
     * @return the hand
     */
    public List<String> getHand() {
        return hand;
    }

    /**
     * @param hand the hand to set
     */
    public void setHand(List<String> hand) {
        this.hand = hand;
    }

    /**
     * @return the deck
     */
    public List<String> getDeck() {
        return deck;
    }

    /**
     * @param deck the deck to set
     */
    public void setDeck(List<String> deck) {
        this.deck = deck;
    }

    /**
     * @return the discardPile
     */
    public List<String> getDiscardPile() {
        return discardPile;
    }

    /**
     * @param discardPile the discardPile to set
     */
    public void setDiscardPile(List<String> discardPile) {
        this.discardPile = discardPile;
    }

    /**
     * @return the money
     */
    public int getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(int money) {
        this.money = money;
    }
}

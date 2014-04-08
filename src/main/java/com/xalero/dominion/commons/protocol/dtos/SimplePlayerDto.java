package com.xalero.dominion.commons.protocol.dtos;

public class SimplePlayerDto {

    private String name;
    private int turnNumber;
    private int numCardsInHand;
    private int actionCount;
    private int buyCount;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the turnNumber
     */
    public int getTurnNumber() {
        return turnNumber;
    }

    /**
     * @param turnNumber the turnNumber to set
     */
    public void setTurnNumber(int turnNumber) {
        this.turnNumber = turnNumber;
    }

    /**
     * @return the numCardsInHand
     */
    public int getNumCardsInHand() {
        return numCardsInHand;
    }

    /**
     * @param numCardsInHand the numCardsInHand to set
     */
    public void setNumCardsInHand(int numCardsInHand) {
        this.numCardsInHand = numCardsInHand;
    }

    /**
     * @return the actionCount
     */
    public int getActionCount() {
        return actionCount;
    }

    /**
     * @param actionCount the actionCount to set
     */
    public void setActionCount(int actionCount) {
        this.actionCount = actionCount;
    }

    /**
     * @return the buyCount
     */
    public int getBuyCount() {
        return buyCount;
    }

    /**
     * @param buyCount the buyCount to set
     */
    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }
    
    
}

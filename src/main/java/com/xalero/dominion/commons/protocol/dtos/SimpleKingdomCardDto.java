package com.xalero.dominion.commons.protocol.dtos;


public class SimpleKingdomCardDto {

	private String kingdomCard;
	private int count;

    /**
     * @return the kingdomCard
     */
    public String getKingdomCard() {
        return kingdomCard;
    }

    /**
     * @param kingdomCard the kingdomCard to set
     */
    public void setKingdomCard(String kingdomCard) {
        this.kingdomCard = kingdomCard;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
}

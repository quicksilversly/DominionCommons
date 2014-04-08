package com.xalero.dominion.commons.ai;

import javafx.application.Platform;

import com.google.gson.Gson;
import com.xalero.dominion.commons.protocol.DominionEvent;
import com.xalero.dominion.commons.protocol.DominionMessage;
import com.xalero.dominion.commons.protocol.dtos.BuyCardDto;
import com.xalero.dominion.commons.protocol.dtos.PlayerGameDto;

public class BuyEstateAI implements IDominionAI {

	private long playerId;
	private Gson gson;
	private int money;
	private boolean myTurn;
	private int myTurnNumber;
	
	public BuyEstateAI(long playerId, int myTurnNumber) {
		this.playerId = playerId;
		this.gson = new Gson();
		this.myTurn = false;
		this.myTurnNumber = myTurnNumber;
		playTurnDaemon();
	}

	@Override
	public void update(String event) {
		DominionMessage message = gson.fromJson(event, DominionMessage.class);
		switch (message.getEvent()) {
		case PLAYER_MODEL:
//			SimpleSpecificPlayer me = gson.fromJson(message.getValue(), SimpleSpecificPlayer.class);
//			money = me.getMoney();
			break;
		case UPDATE_MODEL:
//			SimpleModel simpleModel = gson.fromJson(message.getValue(), SimpleModel.class);
//			if (simpleModel.getPlayerTurn() == myTurnNumber) {
//				myTurn = true;
//			}
			break;
		default:
				break;
		}
	}
	
	public void playTurnDaemon() {
		Platform.runLater(new Runnable() {
			public void run() {
				while (true) {
					if (myTurn == true) {
						takeTurn();
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
	}
	
	public void takeTurn() {
		if (money > 1) {
			BuyCardDto buyCardDto = new BuyCardDto("estate", new PlayerGameDto());
			DominionMessage message = new DominionMessage(DominionEvent.BUY_CARD, gson.toJson(buyCardDto));
//			dominionEventHandler.receiveEvent(gson.toJson(message));
//			message = new DominionMessage(DominionEvent.END_TURN, gson.toJson(new PlayerIdDto(playerId)));
//			dominionEventHandler.receiveEvent(gson.toJson(message));
		}
	}
}

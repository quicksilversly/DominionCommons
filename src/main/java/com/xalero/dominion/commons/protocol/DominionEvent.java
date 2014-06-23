package com.xalero.dominion.commons.protocol;

public enum DominionEvent {
	// The event to tell the server to create a game
	// The event to tell a player that they created a game
    CREATE_GAME ("create_game"), 
    GAME_CREATED("game_created"),
    JOIN_GAME ("join_game"),
    GAME_JOINED("game_joined"),
    GAME_MODEL("update_model"),
    PLAYER_MODEL("player_model"),
    PLAY_CARD("play_card"),
    CARD_PLAYED("card_played"),
    BUY_CARD("buy_card"),
    CARD_BOUGHT("card_bought"),
    END_TURN("end_turn"),
    TURN_ENDED("turn_ended"),
    START_GAME("start_game"),
    GAME_STARTED("game_started"),
    KINGDOM_CARD_LIST("get_kingdom_card_list"),
    CURSES("get_curses"),
    DISCARD_PILE("discard_pile"),
    HAND("hand");

    private final String name;

    DominionEvent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

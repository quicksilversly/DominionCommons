package com.xalero.dominion.commons.model;

import java.util.Random;

public class IdGenerator {

	private static Random rand = new Random();
	
	public static long getUniquePlayerId() {
		return rand.nextLong();
	}
	
	public static long getUniqueGameId() {
		return rand.nextLong();
	}
}

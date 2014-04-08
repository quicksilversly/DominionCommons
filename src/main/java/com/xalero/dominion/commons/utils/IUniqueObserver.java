package com.xalero.dominion.commons.utils;

public interface IUniqueObserver {
	public void update(String event);
	public Long getUniqueId();
}

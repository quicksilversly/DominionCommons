package com.xalero.dominion.commons.utils;

public interface IUniqueObservable {
	public void registerObserver(IUniqueObserver obs, Long uniqueId);
	public void removeObserver(IUniqueObserver obs);
	public void notifyObservers();
	public void notifyObserver(Long uniqueId, String event);
}

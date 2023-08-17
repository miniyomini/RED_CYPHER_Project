package com.cyphers.game.RecordSearch.cyphers.model.enumuration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CyphersGameTypeId {
	RATING("rating"),
	NORMAL("normal"),;
	
	private String value;
	
    public String value() {
    	return value;
    }
}

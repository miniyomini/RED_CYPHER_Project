package com.cyphers.game.RecordSearch.cyphers.model.enumuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum CyphersWordType {
    MATCH("match"),
    FULL("full"),
	front("front"),;

    private String value;
    
    public String value() {
    	return value;
    }
}

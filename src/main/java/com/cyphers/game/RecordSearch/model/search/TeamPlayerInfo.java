package com.cyphers.game.RecordSearch.model.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamPlayerInfo {
	private String characterId;
	private String nickname;
}

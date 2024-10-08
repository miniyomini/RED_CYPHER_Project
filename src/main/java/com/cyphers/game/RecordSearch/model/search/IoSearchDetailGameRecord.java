package com.cyphers.game.RecordSearch.model.search;

import java.util.List;

import com.cyphers.game.RecordSearch.openapi.model.CyphersCharacterAttribute;
import com.cyphers.game.RecordSearch.openapi.model.CyphersEquipItems;
import com.cyphers.game.RecordSearch.openapi.model.CyphersPositionAttribute;
import com.cyphers.game.RecordSearch.openapi.model.enumuration.CyphersGameType;

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
public class IoSearchDetailGameRecord {

	private String matchId;
	private String playDate;
    private CyphersGameType gameType;
    private String result;
    private String characterId;
    private String characterName;
    private String positionName;
    private List<CyphersCharacterAttribute> attributeInfos;

    private Integer killCount;
    private Integer deathCount;
    private Integer assistCount;
    private Integer killParticipation;	//킬 관여율. (나의 킬 + 어시/아군팀 총 킬수)
    private Float kda;
    private Integer csCount;

    private List<CyphersEquipItems> itemInfos;

    private Integer healAmount;
    private Integer attackPoint;
    private Integer damagePoint;
    private Integer getCoin;
    private Integer battlePoint;
    private Integer sightPoint;

    private List<TeamPlayerResponse> teamPlayerInfos;
}

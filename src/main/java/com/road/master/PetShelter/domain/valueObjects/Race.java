package com.road.master.PetShelter.domain.valueObjects;

import com.road.master.PetShelter.domain.exceptions.MissingArgumentException;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public class Race {

    private String value;

    public Race(String race){
        if(StringUtils.isBlank(race)) throw new MissingArgumentException("Race");
        this.value = race;
    }
}

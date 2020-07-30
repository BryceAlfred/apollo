package com.company.apollo.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum NextStepEnum implements EnumClass<String> {

    ANOTHER_ACTIVITY("Another-Activity"),
    POC("POC"),
    QUOTE("Quote"),
    PROSPECT_LOST("Prospect-Lost");

    private String id;

    NextStepEnum(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static NextStepEnum fromId(String id) {
        for (NextStepEnum at : NextStepEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
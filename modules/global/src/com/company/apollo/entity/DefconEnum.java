package com.company.apollo.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum DefconEnum implements EnumClass<String> {

    FIVE("5"),
    FOUR("4"),
    THREE("3"),
    TWO("2");

    private String id;

    DefconEnum(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static DefconEnum fromId(String id) {
        for (DefconEnum at : DefconEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
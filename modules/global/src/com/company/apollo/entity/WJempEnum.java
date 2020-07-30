package com.company.apollo.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum WJempEnum implements EnumClass<String> {

    KYLE("Kyle"),
    TOM("Tom"),
    BRYCE("Bryce");

    private String id;

    WJempEnum(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static WJempEnum fromId(String id) {
        for (WJempEnum at : WJempEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
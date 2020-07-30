package com.company.apollo.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum OpenClosedEnum implements EnumClass<String> {

    OPEN("Open"),
    CLOSED("Closed");

    private String id;

    OpenClosedEnum(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static OpenClosedEnum fromId(String id) {
        for (OpenClosedEnum at : OpenClosedEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
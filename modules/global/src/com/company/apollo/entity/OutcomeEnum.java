package com.company.apollo.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum OutcomeEnum implements EnumClass<String> {

    BECAME_CLIENT("Became Client"),
    LOST("Lost");

    private String id;

    OutcomeEnum(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static OutcomeEnum fromId(String id) {
        for (OutcomeEnum at : OutcomeEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
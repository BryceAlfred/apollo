package com.company.apollo.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ActivityTypeEnum implements EnumClass<String> {

    FACE("Face"),
    EMAIL("Email"),
    PHONE("Phone"),
    ZOOM("Zoom"),
    PRESENTATION("Presentation"),
    POC("POC"),
    QUOTE("Quote"),
    DELIVERY("Delivery");

    private String id;

    ActivityTypeEnum(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ActivityTypeEnum fromId(String id) {
        for (ActivityTypeEnum at : ActivityTypeEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
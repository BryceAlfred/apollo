package com.company.apollo.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum HowObtainedEnum implements EnumClass<String> {

    CLIENT("Client"),
    CLIENT_REFERRED("Client Reffered"),
    REFERRAL("Referral"),
    NETWORKING("Networking"),
    PRESENTATION("Presentation");

    private String id;

    HowObtainedEnum(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static HowObtainedEnum fromId(String id) {
        for (HowObtainedEnum at : HowObtainedEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
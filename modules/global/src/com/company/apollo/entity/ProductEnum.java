package com.company.apollo.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ProductEnum implements EnumClass<String> {

    APPS("Apps"),
    DASHBOARDS("Dashboards"),
    BOTH("Both");

    private String id;

    ProductEnum(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ProductEnum fromId(String id) {
        for (ProductEnum at : ProductEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
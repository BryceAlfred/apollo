package com.company.apollo.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;

@NamePattern("%s|name")
@Table(name = "APOLLO_CONTACTS_TABLE")
@Entity(name = "apollo_ContactsTable")
public class ContactsTable extends StandardEntity {
    private static final long serialVersionUID = -1044845395828116273L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "ADDRESS")
    protected String address;

    @Email
    @Column(name = "EMAIL")
    protected String email;

    @Column(name = "PHONE")
    protected String phone;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROSPECTS_ID")
    protected Prospects prospects;

    public Prospects getProspects() {
        return prospects;
    }

    public void setProspects(Prospects prospects) {
        this.prospects = prospects;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
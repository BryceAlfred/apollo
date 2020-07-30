package com.company.apollo.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "APOLLO_PROSPECTS")
@Entity(name = "apollo_Prospects")
public class Prospects extends StandardEntity {
    private static final long serialVersionUID = -7206005875812061254L;

    @Column(name = "PROSPECT")
    protected String prospect;

    @Column(name = "WJEMP_ENUM")
    protected String wjempEnum;

    @Column(name = "ADDRESS")
    protected String address;

    @Column(name = "CITY")
    protected String city;

    @Column(name = "STATE")
    protected String state;

    @Column(name = "ZIP")
    protected String zip;

    @Column(name = "OUTCOME_ENUM")
    protected String outcomeEnum;

    @Column(name = "PRODUCT_ENUM")
    protected String productEnum;

    @Temporal(TemporalType.DATE)
    @Column(name = "ORIGINALPROSPECT_DATE")
    protected Date originalprospectDate;

    @Column(name = "DEFCON_ENUM")
    protected String defconEnum;

    @Column(name = "VPM_ID")
    protected String vpmID;

    @Column(name = "FOLLOW_UP")
    protected Boolean followUp;

    @Column(name = "HOW_OBTAINED_ENUM")
    protected String howObtainedEnum;

    @Column(name = "WHAT_EVENT")
    protected String whatEvent;

    @Column(name = "HOW_OBTAINED_NOTES")
    protected String howObtainedNotes;

    @Column(name = "ESTREVENUE")
    protected String estrevenue;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "prospects")
    protected List<ContactsTable> contactsTable;

    public List<ContactsTable> getContactsTable() {
        return contactsTable;
    }

    public void setContactsTable(List<ContactsTable> contactsTable) {
        this.contactsTable = contactsTable;
    }

    public String getWhatEvent() {
        return whatEvent;
    }

    public void setWhatEvent(String whatEvent) {
        this.whatEvent = whatEvent;
    }

    public Date getOriginalprospectDate() {
        return originalprospectDate;
    }

    public void setOriginalprospectDate(Date originalprospectDate) {
        this.originalprospectDate = originalprospectDate;
    }

    public ProductEnum getProductEnum() {
        return productEnum == null ? null : ProductEnum.fromId(productEnum);
    }

    public void setProductEnum(ProductEnum productEnum) {
        this.productEnum = productEnum == null ? null : productEnum.getId();
    }

    public DefconEnum getDefconEnum() {
        return defconEnum == null ? null : DefconEnum.fromId(defconEnum);
    }

    public void setDefconEnum(DefconEnum defconEnum) {
        this.defconEnum = defconEnum == null ? null : defconEnum.getId();
    }

    public String getVpmID() {
        return vpmID;
    }

    public void setVpmID(String vpmID) {
        this.vpmID = vpmID;
    }

    public WJempEnum getWjempEnum() {
        return wjempEnum == null ? null : WJempEnum.fromId(wjempEnum);
    }

    public void setWjempEnum(WJempEnum wjempEnum) {
        this.wjempEnum = wjempEnum == null ? null : wjempEnum.getId();
    }

    public String getEstrevenue() {
        return estrevenue;
    }

    public void setEstrevenue(String estrevenue) {
        this.estrevenue = estrevenue;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHowObtainedNotes() {
        return howObtainedNotes;
    }

    public void setHowObtainedNotes(String howObtainedNotes) {
        this.howObtainedNotes = howObtainedNotes;
    }

    public HowObtainedEnum getHowObtainedEnum() {
        return howObtainedEnum == null ? null : HowObtainedEnum.fromId(howObtainedEnum);
    }

    public void setHowObtainedEnum(HowObtainedEnum howObtainedEnum) {
        this.howObtainedEnum = howObtainedEnum == null ? null : howObtainedEnum.getId();
    }

    public Boolean getFollowUp() {
        return followUp;
    }

    public void setFollowUp(Boolean followUp) {
        this.followUp = followUp;
    }

    public OutcomeEnum getOutcomeEnum() {
        return outcomeEnum == null ? null : OutcomeEnum.fromId(outcomeEnum);
    }

    public void setOutcomeEnum(OutcomeEnum outcomeEnum) {
        this.outcomeEnum = outcomeEnum == null ? null : outcomeEnum.getId();
    }

    public String getProspect() {
        return prospect;
    }

    public void setProspect(String prospect) {
        this.prospect = prospect;
    }
}
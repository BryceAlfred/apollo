package com.company.apollo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "APOLLO_REFERRALS")
@Entity(name = "apollo_Referrals")
public class Referrals extends StandardEntity {
    private static final long serialVersionUID = 6360477268464812150L;

    @Column(name = "PROSPECT_REFERRAL")
    protected String prospectReferral;

    @Temporal(TemporalType.DATE)
    @Column(name = "PROSPECTREFERRAL_DATE")
    protected Date prospectreferralDate;

    @Column(name = "REFERRAL_ADDRESS")
    protected String referralAddress;

    @Column(name = "REFERRAL_CITY")
    protected String referralCity;

    @Column(name = "REFERRAL_STATE")
    protected String referralState;

    @Column(name = "REFERRAL_ZIP")
    protected String referralZip;

    @Column(name = "REFERRAL_COMPANY_PERSON")
    protected String referralCompanyPerson;

    public void setProspectreferralDate(Date prospectreferralDate) {
        this.prospectreferralDate = prospectreferralDate;
    }

    public Date getProspectreferralDate() {
        return prospectreferralDate;
    }

    public String getReferralCompanyPerson() {
        return referralCompanyPerson;
    }

    public void setReferralCompanyPerson(String referralCompanyPerson) {
        this.referralCompanyPerson = referralCompanyPerson;
    }

    public String getReferralZip() {
        return referralZip;
    }

    public void setReferralZip(String referralZip) {
        this.referralZip = referralZip;
    }

    public String getReferralState() {
        return referralState;
    }

    public void setReferralState(String referralState) {
        this.referralState = referralState;
    }

    public String getReferralCity() {
        return referralCity;
    }

    public void setReferralCity(String referralCity) {
        this.referralCity = referralCity;
    }

    public String getReferralAddress() {
        return referralAddress;
    }

    public void setReferralAddress(String referralAddress) {
        this.referralAddress = referralAddress;
    }

    public String getProspectReferral() {
        return prospectReferral;
    }

    public void setProspectReferral(String prospectReferral) {
        this.prospectReferral = prospectReferral;
    }
}
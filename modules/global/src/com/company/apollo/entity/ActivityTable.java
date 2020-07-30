package com.company.apollo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "APOLLO_ACTIVITY_TABLE")
@Entity(name = "apollo_ActivityTable")
public class ActivityTable extends StandardEntity {
    private static final long serialVersionUID = -5674361205383487019L;

    @Column(name = "OPEN_CLOSED_ENUM")
    protected String openClosedEnum;

    @Column(name = "N_OTES")
    protected String nOtes;

    @Temporal(TemporalType.DATE)
    @Column(name = "COMPLETED_DATE")
    protected Date completedDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_ACTIVITY")
    protected Date dateActivity;

    @Column(name = "ACTIVITYTYPE_ENUM")
    protected String activitytypeEnum;

    @Column(name = "NOTES")
    protected String notes;

    @Column(name = "NEXTSTEP")
    protected String nextstep;

    public String getNOtes() {
        return nOtes;
    }

    public void setNOtes(String nOtes) {
        this.nOtes = nOtes;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    public OpenClosedEnum getOpenClosedEnum() {
        return openClosedEnum == null ? null : OpenClosedEnum.fromId(openClosedEnum);
    }

    public void setOpenClosedEnum(OpenClosedEnum openClosedEnum) {
        this.openClosedEnum = openClosedEnum == null ? null : openClosedEnum.getId();
    }

    public void setDateActivity(Date dateActivity) {
        this.dateActivity = dateActivity;
    }

    public Date getDateActivity() {
        return dateActivity;
    }

    public NextStepEnum getNextstep() {
        return nextstep == null ? null : NextStepEnum.fromId(nextstep);
    }

    public void setNextstep(NextStepEnum nextstep) {
        this.nextstep = nextstep == null ? null : nextstep.getId();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ActivityTypeEnum getActivitytypeEnum() {
        return activitytypeEnum == null ? null : ActivityTypeEnum.fromId(activitytypeEnum);
    }

    public void setActivitytypeEnum(ActivityTypeEnum activitytypeEnum) {
        this.activitytypeEnum = activitytypeEnum == null ? null : activitytypeEnum.getId();
    }

}
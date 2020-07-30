-- begin APOLLO_PROSPECTS
create table APOLLO_PROSPECTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PROSPECT varchar(255),
    WJEMP_ENUM varchar(50),
    ADDRESS varchar(255),
    CITY varchar(255),
    STATE varchar(255),
    ZIP varchar(255),
    OUTCOME_ENUM varchar(50),
    PRODUCT_ENUM varchar(50),
    ORIGINALPROSPECT_DATE date,
    DEFCON_ENUM varchar(50),
    VPM_ID varchar(255),
    FOLLOW_UP boolean,
    HOW_OBTAINED_ENUM varchar(50),
    WHAT_EVENT varchar(255),
    HOW_OBTAINED_NOTES varchar(255),
    ESTREVENUE varchar(255),
    --
    primary key (ID)
)^
-- end APOLLO_PROSPECTS
-- begin APOLLO_ACTIVITY_TABLE
create table APOLLO_ACTIVITY_TABLE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    OPEN_CLOSED_ENUM varchar(50),
    N_OTES varchar(255),
    COMPLETED_DATE date,
    DATE_ACTIVITY date,
    ACTIVITYTYPE_ENUM varchar(50),
    NOTES varchar(255),
    NEXTSTEP varchar(50),
    --
    primary key (ID)
)^
-- end APOLLO_ACTIVITY_TABLE
-- begin APOLLO_CONTACTS_TABLE
create table APOLLO_CONTACTS_TABLE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    ADDRESS varchar(255),
    EMAIL varchar(255),
    PHONE varchar(255),
    PROSPECTS_ID varchar(36),
    --
    primary key (ID)
)^
-- end APOLLO_CONTACTS_TABLE
-- begin APOLLO_REFERRALS
create table APOLLO_REFERRALS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PROSPECT_REFERRAL varchar(255),
    PROSPECTREFERRAL_DATE date,
    REFERRAL_ADDRESS varchar(255),
    REFERRAL_CITY varchar(255),
    REFERRAL_STATE varchar(255),
    REFERRAL_ZIP varchar(255),
    REFERRAL_COMPANY_PERSON varchar(255),
    --
    primary key (ID)
)^
-- end APOLLO_REFERRALS

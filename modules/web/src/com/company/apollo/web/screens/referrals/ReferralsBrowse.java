package com.company.apollo.web.screens.referrals;

import com.haulmont.cuba.gui.screen.*;
import com.company.apollo.entity.Referrals;

@UiController("apollo_Referrals.browse")
@UiDescriptor("referrals-browse.xml")
@LookupComponent("referralsesTable")
@LoadDataBeforeShow
public class ReferralsBrowse extends StandardLookup<Referrals> {
}
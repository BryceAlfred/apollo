package com.company.apollo.web.screens.referrals;

import com.haulmont.cuba.gui.screen.*;
import com.company.apollo.entity.Referrals;

@UiController("apollo_Referrals.edit")
@UiDescriptor("referrals-edit.xml")
@EditedEntityContainer("referralsDc")
@LoadDataBeforeShow
public class ReferralsEdit extends StandardEditor<Referrals> {
}
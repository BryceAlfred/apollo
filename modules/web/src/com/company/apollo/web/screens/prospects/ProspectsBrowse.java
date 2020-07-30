package com.company.apollo.web.screens.prospects;

import com.haulmont.cuba.gui.screen.*;
import com.company.apollo.entity.Prospects;

@UiController("apollo_Prospects.browse")
@UiDescriptor("prospects-browse.xml")
@LookupComponent("prospectsesTable")
@LoadDataBeforeShow
public class ProspectsBrowse extends StandardLookup<Prospects> {
}
package com.company.apollo.web.screens.prospects;

import com.haulmont.cuba.gui.screen.*;
import com.company.apollo.entity.Prospects;

@UiController("apollo_Prospects.edit")
@UiDescriptor("prospects-edit.xml")
@EditedEntityContainer("prospectsDc")
@LoadDataBeforeShow
public class ProspectsEdit extends StandardEditor<Prospects> {
}
package com.company.apollo.web.screens.activitytable;

import com.haulmont.cuba.gui.screen.*;
import com.company.apollo.entity.ActivityTable;

@UiController("apollo_ActivityTable.edit")
@UiDescriptor("activity-table-edit.xml")
@EditedEntityContainer("activityTableDc")
@LoadDataBeforeShow
public class ActivityTableEdit extends StandardEditor<ActivityTable> {
}
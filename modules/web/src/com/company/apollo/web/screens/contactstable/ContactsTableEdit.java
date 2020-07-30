package com.company.apollo.web.screens.contactstable;

import com.haulmont.cuba.gui.screen.*;
import com.company.apollo.entity.ContactsTable;

@UiController("apollo_ContactsTable.edit")
@UiDescriptor("contacts-table-edit.xml")
@EditedEntityContainer("contactsTableDc")
@LoadDataBeforeShow
public class ContactsTableEdit extends StandardEditor<ContactsTable> {
}
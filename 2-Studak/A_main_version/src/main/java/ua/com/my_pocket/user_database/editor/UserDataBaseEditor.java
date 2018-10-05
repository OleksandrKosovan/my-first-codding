package ua.com.my_pocket.user_database.editor;

import java.beans.PropertyEditorSupport;

import ua.com.my_pocket.user_database.service.UserDataBaseService;

/**
 * @author Kosovan Olexandr
 * @version 1.0
 */
public class UserDataBaseEditor extends PropertyEditorSupport {

	private final UserDataBaseService userDataBaseService;

	public UserDataBaseEditor(UserDataBaseService userDataBaseService) {
		super();
		this.userDataBaseService = userDataBaseService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(userDataBaseService.findOne(Integer.parseInt(text)));
	}
}

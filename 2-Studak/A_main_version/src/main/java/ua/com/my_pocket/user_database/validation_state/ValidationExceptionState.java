package ua.com.my_pocket.user_database.validation_state;

public class ValidationExceptionState extends Exception {

	private static final long serialVersionUID = 1L;

	public ValidationExceptionState(String messege) {
		super(messege);
	}
}

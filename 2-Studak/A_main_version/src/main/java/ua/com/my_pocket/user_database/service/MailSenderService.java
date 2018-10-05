package ua.com.my_pocket.user_database.service;

/**
 * 
 * @author Kosovan Olexandr
 * @version 1.0
 * @interface from method for send mail
 */
public interface MailSenderService {

	void sendMail(String content, String mailBody, String email);
}

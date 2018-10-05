package ua.com.kosovan.bookset.service;

public interface MailSenderService {

	void sendMail(String content, String mailBody, String email);
}

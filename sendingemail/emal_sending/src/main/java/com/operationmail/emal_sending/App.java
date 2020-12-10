package com.operationmail.emal_sending;

import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Preparing to send message");
		String message = "This is the message for security check";
		String subject = "Coders Area: confirmation";
		String to = "priyankapk112233@gmail.com";
		String from = "freedomfreedom618@gmail.com";
		sendEmail(message, subject, to, from);
	}

	private static void sendEmail(String message, String subject, String to, String from) throws Exception {
		String host = "smtp.gmail.com";
		Properties properties = System.getProperties();
		System.out.println(properties);
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");

		Session session = Session.getInstance(properties, new Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication("freedomfreedom618@gmail.com", "priyanka93");
			}
		});
		session.setDebug(true);
		MimeMessage m = new MimeMessage(session);
		m.setFrom(from);
		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		m.setText(message);
		Transport.send(m);
	}
}

package com.yash.pms.email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Emailer {

    private static final String username="kandratechnologies@gmail.com";
    private static final String password="koww aukk udme szyi";
    private static Session session;  

   

    public static void send(String email, String subject, String content) {
        if (hasSession()) {
            try {
                Transport.send(createMimeMessage(email, session, subject, content));
                System.out.printf("Email sent to %s%n", email);
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean hasSession() {
        if (session == null) {
            session = startSessionTLS();
        }
        if (session == null) {
            System.out.printf("Cannot start email session%n");
            return false;
        }
        return true;
    }

    private static Session startSessionTLS() {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        props.put("mail.smtp.starttls.required", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        return Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
    }

    private static MimeMessage createMimeMessage(String email, Session session, String subject, String body) throws MessagingException {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress("noreply@email.com"));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
        message.setSubject(subject);
       // message.setText(body);
        message.setContent(body,"text/html");
        return message;
    }
}
package com.dc.Email_Sender;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String to, String name) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Seeking a Chance – Fresher Software Engineer Resume");
        message.setText("Respected " + name +",\n" +
                "\n" +
                "I’m a recent graduate struggling to get my first opportunity in the software industry. I know I have a lot to learn, but I’m passionate, sincere, and ready to give my best.\n" +
                "\n" +
                "Please consider looking at my resume for any fresher roles. Even a small opportunity would mean a lot to me.\n" +
                "\n" +
                "Thank you for your time.\n" +
                "\n" +
                "Sincerely,\n" +
                "Divyansh Chawla\n" +
                "+91 9818903506\n" +
                "https://drive.google.com/file/d/1DuNXJzR89adxU7GiSLYTrIZfC1vvhLQg/view?usp=sharing");
        mailSender.send(message);
        log.info("Email sent to " + to);
    }
}

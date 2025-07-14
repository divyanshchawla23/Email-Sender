package com.dc.Email_Sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmailScheduler {

    @Autowired
    private EmailService emailService;
    @Autowired
    private EmailRepository emailRepository;


    public void sendNextEmail() {

        List<EmailPerson> recipients = emailRepository.findAll();

        for (EmailPerson i : recipients) {
            if (i.getEmail() != null && i.getName() != null) {
                try {
                    emailService.sendEmail(i.getEmail(), i.getName());
                } catch (Exception e) {
                    System.err.println("Company name" + i.getCompany() + "❌ Failed to send to " + i.getEmail() + ": " + e.getMessage());
                }
            }
        }
    }
}

package com.dc.Email_Sender;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EmailController {
    @Autowired
    private EmailScheduler emailScheduler;

    @GetMapping("/test")
    public String test() {
        return "Test endpoint is working!";
    }

    @GetMapping("/trigger")
    public void sendEmail() {
        emailScheduler.sendNextEmail();
    }
}

package com.example.send_email.service;

import com.example.send_email.model.EmailDetails;

public interface EmailService {

    // To send a simple email
    String sendSimpleMail(EmailDetails details);

    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);
}

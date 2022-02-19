package com.springboot.emailsender.services;


import com.springboot.emailsender.model.Mail;

public interface MailService {
    public void sendEmail(Mail mail);
}




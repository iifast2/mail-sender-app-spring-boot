package com.springboot.emailsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.emailsender.model.Mail;
import com.springboot.emailsender.services.MailService;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.springboot"
})

public class EmailSenderApplication {

        public static void main(String[] args) {

            Mail mail = new Mail();
            mail.setMailFrom("YourGmailAddress@gmail.com");
            mail.setMailTo("YourGmailAddress@gmail.com");
            mail.setMailSubject("Spring Boot - Email Example");
            mail.setMailContent("Learn How to send Email using Spring Boot!!!\n\nThanks\nmabttech.medium.com");

            ApplicationContext ctx = SpringApplication.run(EmailSenderApplication.class, args);
            MailService mailService = (MailService) ctx.getBean("mailService");
            mailService.sendEmail(mail);

        }

        // SpringApplication.run(EmailSenderApplication.class, args);
    }




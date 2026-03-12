package com.projeto1.Api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String mailUser;

    public String sendEmail(String destinatario, String assunto, String mensagem) {

        try {
            SimpleMailMessage mail = new SimpleMailMessage();
            mail.setFrom(mailUser);
            mail.setTo(destinatario);
            mail.setSubject(assunto);
            mail.setText(mensagem);

            javaMailSender.send(mail);

            return "E-mail enviado com sucesso!";
        } catch (Exception e) {
            return "Erro ao enviar e-mail: " + e.getMessage();
        }
    }
}

package com.ada.mail_validation.service;

import com.ada.mail_validation.dto.MailValidationDTO;


public interface MailValidationService {
    MailValidationDTO save(String email);
    boolean validate(String email);
}

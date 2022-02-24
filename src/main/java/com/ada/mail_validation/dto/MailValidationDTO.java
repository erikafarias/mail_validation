package com.ada.mail_validation.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MailValidationDTO {
    private Long id;
    private String email;
    private boolean validated;
    private LocalDate creationDate;
}

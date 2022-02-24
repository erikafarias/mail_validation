package com.ada.mail_validation.mapper;

import com.ada.mail_validation.dto.MailValidationDTO;
import com.ada.mail_validation.entity.MailValidationEntity;
import com.ada.mail_validation.service.MailValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MailValidationMapper {

    public MailValidationEntity mailValDTO2Entity(String email, boolean validation) {
        MailValidationEntity mailValidationEntity = new MailValidationEntity();
        mailValidationEntity.setEmail(email);
        mailValidationEntity.setValidated(validation);
        mailValidationEntity.setCreationDate(LocalDate.now());
        return mailValidationEntity;
    }

    public MailValidationDTO mailValEntity2DTO(MailValidationEntity entity) {
        MailValidationDTO mailValidationDTO = new MailValidationDTO();
        mailValidationDTO.setId(entity.getId());
        mailValidationDTO.setEmail(entity.getEmail());
        mailValidationDTO.setValidated(entity.isValidated());
        mailValidationDTO.setCreationDate(entity.getCreationDate());
        return mailValidationDTO;
    }
}

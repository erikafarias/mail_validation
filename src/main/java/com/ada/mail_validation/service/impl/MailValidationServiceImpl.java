package com.ada.mail_validation.service.impl;

import com.ada.mail_validation.dto.MailValidationDTO;
import com.ada.mail_validation.entity.MailValidationEntity;
import com.ada.mail_validation.mapper.MailValidationMapper;
import com.ada.mail_validation.repository.MailValidationRepository;
import com.ada.mail_validation.service.MailValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class MailValidationServiceImpl implements MailValidationService {
    @Autowired
    private MailValidationMapper mailValidationMapper;
    @Autowired
    private MailValidationRepository mailValidationRepository;

    public MailValidationDTO save(String email) {
        boolean validation = validate(email);
        MailValidationEntity mailValEntity = mailValidationMapper.mailValDTO2Entity(email, validation);
        MailValidationEntity savedEntity = mailValidationRepository.save(mailValEntity);
        MailValidationDTO result = mailValidationMapper.mailValEntity2DTO(savedEntity);
        return result;
    }

    public boolean validate(String email){
        Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

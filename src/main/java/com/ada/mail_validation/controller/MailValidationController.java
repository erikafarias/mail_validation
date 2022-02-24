package com.ada.mail_validation.controller;

import com.ada.mail_validation.dto.MailValidationDTO;
import com.ada.mail_validation.service.MailValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("mail_validation")
public class MailValidationController {

    @Autowired
    private MailValidationService mailValidationService;

    @PostMapping
    @RequestMapping(value = "/mail_validation", params = "email")
    public ResponseEntity<MailValidationDTO> save(@RequestParam String email){
        MailValidationDTO savedMailValidation = mailValidationService.save(email);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMailValidation);
    }

}

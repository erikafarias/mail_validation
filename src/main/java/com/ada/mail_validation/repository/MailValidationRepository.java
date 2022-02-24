package com.ada.mail_validation.repository;

import com.ada.mail_validation.entity.MailValidationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface MailValidationRepository extends JpaRepository<MailValidationEntity, Long> {

}

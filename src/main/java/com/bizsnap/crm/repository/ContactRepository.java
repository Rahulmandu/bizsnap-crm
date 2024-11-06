package com.bizsnap.crm.repository;

import com.bizsnap.crm.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}

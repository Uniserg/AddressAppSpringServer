package com.serguni.addressappspringserver.repositories;

import com.serguni.addressappspringserver.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

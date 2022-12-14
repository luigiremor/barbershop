package com.barbershop.app.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barbershop.app.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}

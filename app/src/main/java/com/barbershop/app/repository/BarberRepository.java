package com.barbershop.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barbershop.app.model.Barber;

@Repository
public interface BarberRepository extends JpaRepository<Barber, Long> {
}

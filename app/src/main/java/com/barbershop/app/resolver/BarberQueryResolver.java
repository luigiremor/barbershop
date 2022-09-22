package com.barbershop.app.resolver;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barbershop.app.model.Barber;
import com.barbershop.app.repository.BarberRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class BarberQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private BarberRepository barberRepository;

	public Collection<Barber> findAllBarbers() {
		return barberRepository.findAll();
	}
}
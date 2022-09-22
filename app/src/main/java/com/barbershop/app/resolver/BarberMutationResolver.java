package com.barbershop.app.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barbershop.app.input.BarberInput;
import com.barbershop.app.model.Barber;
import com.barbershop.app.repository.BarberRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class BarberMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private BarberRepository barberRepository;

	public Barber saveBarber(BarberInput input) {
		return barberRepository.save(new Barber(input.getName()));
	}

}

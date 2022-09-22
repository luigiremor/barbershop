package com.barbershop.app.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barbershop.app.input.ScheduleInput;
import com.barbershop.app.model.Barber;
import com.barbershop.app.model.Person;
import com.barbershop.app.model.Schedule;
import com.barbershop.app.repository.BarberRepository;
import com.barbershop.app.repository.PersonRepository;
import com.barbershop.app.repository.ScheduleRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class ScheduleMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private ScheduleRepository scheduleRepository;

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private BarberRepository barberRepository;

	public Schedule saveSchedule(ScheduleInput input) {
		Person costumer = personRepository.findById(input.getCostumerId()).get();
		Barber barber = barberRepository.findById(input.getBarberId()).get();
		return scheduleRepository.save(new Schedule(input.getDate(), barber, costumer));
	}
}

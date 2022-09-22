package com.barbershop.app.resolver;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barbershop.app.model.Schedule;
import com.barbershop.app.repository.ScheduleRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class ScheduleQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private ScheduleRepository scheduleRepository;

//	public Long countSchedules() {
//		return scheduleRepository.count();
//	}

	public Collection<Schedule> findAllSchedules() {
		return scheduleRepository.findAll();
	}

}

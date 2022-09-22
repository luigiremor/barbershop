package com.barbershop.app.resolver;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.barbershop.app.input.PersonInput;
import com.barbershop.app.model.Person;
import com.barbershop.app.repository.PersonRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class PersonQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private PersonRepository personRepository;

	public Collection<Person> findAllPeople() {
		return personRepository.findAll();
	}

	public Person findPersonById(Long id) {
		return personRepository.findById(id).get();
	}



}

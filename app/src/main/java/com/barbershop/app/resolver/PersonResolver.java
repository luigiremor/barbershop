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
public class PersonResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private PersonRepository personRepository;

	public Collection<Person> findAllPeople() {
		return personRepository.findAll();
	}

	public Person savePerson(PersonInput input) {
		return	personRepository.save(new Person(input.getName(), input.getAge(), input.getGender()));
	}


}

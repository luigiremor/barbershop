package com.barbershop.test.resolver;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barbershop.test.input.PersonInput;
import com.barbershop.test.model.Person;
import com.barbershop.test.repository.PersonRepository;
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
		Person person = new Person(input.getName(), input.getAge(), input.getGender());
		return personRepository.save(person);
	}


}

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
public class PersonMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private PersonRepository personRepository;

	public Person savePerson(PersonInput input) {
		return	personRepository.save(new Person(input.getName(), input.getAge(), input.getGender()));
	}

	public Person updateAge(Long id, Integer age) {
		Person person = personRepository.findById(id).get();
		person.setAge(age);
		return personRepository.save(person);
	}



}

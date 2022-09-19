package com.barbershop.app.input;

import lombok.Getter;
import lombok.Setter;

import com.barbershop.app.model.Gender;

import graphql.schema.GraphQLInputType;


@Getter
@Setter
public class PersonInput implements GraphQLInputType {

	@Override
	public String getName() {
		return name;
	}

	private String name;
	private Integer age;
	private Gender gender;


}

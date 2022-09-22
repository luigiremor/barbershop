package com.barbershop.app.input;

import lombok.Getter;
import lombok.Setter;

import graphql.schema.GraphQLInputType;

@Getter
@Setter
public class BarberInput implements GraphQLInputType {

	@Override
	public String getName() {
		return name;
	}

	private String name;




}

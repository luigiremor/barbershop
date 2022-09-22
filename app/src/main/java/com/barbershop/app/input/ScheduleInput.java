package com.barbershop.app.input;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

import graphql.schema.GraphQLInputType;

@Getter
@Setter
public class ScheduleInput implements GraphQLInputType {

	@Override
	public String getName() {
		return null;
	}


	private String date;
	private Long barberId;
	private Long costumerId;

}

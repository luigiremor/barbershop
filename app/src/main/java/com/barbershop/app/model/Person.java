package com.barbershop.app.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PEOPLE")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "AGE")
	private Integer age;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	@OneToMany(mappedBy = "costumer")
	private Collection<Schedule> schedules;

	public Person(String name, Integer age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


}

package com.barbershop.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "SCHEDULES")
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "DATE")
	private String date;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COSTUMER_ID", nullable = false)
	private Person costumer;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BARBER_ID", nullable = false)
	private Barber barber;

	public Schedule(String date, Barber barber, Person costumer) {
		this.date = date;
		this.barber = barber;
		this.costumer = costumer;
	}

}

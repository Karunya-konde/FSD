package com.mycompany.org.hybernetMapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "instructor")
public class instructor {
	@Id
	@Column(name = "instructor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int instructor_id;

	private String firstName;

	private String lastName;

	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	private InstructorDetail instructorDetail;
}
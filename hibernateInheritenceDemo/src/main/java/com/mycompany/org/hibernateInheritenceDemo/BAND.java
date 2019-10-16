package com.mycompany.org.hibernateInheritenceDemo;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "band_type")
@DiscriminatorValue("BAND")
public class BAND {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String artist;
	private String location;
	private int no_artist;

	public BAND() {
	}

	public BAND(String title, String artist, String location, int no_artist) {
		this.title = title;
		this.artist = artist;
		this.location = location;
		this.no_artist = no_artist;
	}
}
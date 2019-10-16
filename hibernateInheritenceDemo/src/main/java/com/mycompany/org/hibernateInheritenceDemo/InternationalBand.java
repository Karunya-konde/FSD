package com.mycompany.org.hibernateInheritenceDemo;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("International Band")
public class InternationalBand extends BAND {
	private String languages;
	private int region;

	public InternationalBand() {
	}

	public InternationalBand(String title, String artist, String location, int no_artist,  String language, int region) {
		super(title, artist, location,no_artist);
		languages = language;
		this.region = region;
	}
}
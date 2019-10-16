package com.mycompany.org.hibernateInheritenceDemo;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("Modern Band")
public class ModernBand extends BAND {
	private String newinstruments;

	public ModernBand() {
		super();
	}

	public ModernBand(String title, String artist, String location, int no_artist, String instruments) {
		super(title, artist, location,no_artist);
		newinstruments = instruments;
	}
}
package com.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties
public class Theatre {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int theatreId;
private String theatreName;
private String theatreLocation;
private String city;
private long contact;

@OneToMany(mappedBy = "theatre",cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
private List<Screen> screens=new ArrayList<>();
public Theatre() {
	super();
}
public Theatre(String theatreName, String theatreLocation, String city, long contact, List<Screen> screens) {
	super();
	this.theatreName = theatreName;
	this.city = city;
	this.contact = contact;
	this.screens = screens;
}
public Theatre(String theatreName, String theatreLocation, String city, long contact) {
	super();
	this.theatreName = theatreName;
	this.theatreLocation = theatreLocation;
	this.city = city;
	this.contact = contact;
}
public Theatre(int theatreId, String theatreName, String theatreLocation, String city, long contact,
		List<Screen> screens) {
	super();
	this.theatreId = theatreId;
	this.theatreName = theatreName;
	this.theatreLocation = theatreLocation;
	this.city = city;
	this.contact = contact;
	this.screens = screens;
}

public Theatre(String theatreName) {
	super();
	this.theatreName = theatreName;
}
public int getTheatreId() {
	return theatreId;
}
public void setTheatreId(int theatreId) {
	this.theatreId = theatreId;
}
public String getTheatreName() {
	return theatreName;
}
public void setTheatreName(String theatreName) {
	this.theatreName = theatreName;
}
public String getTheatreLocation() {
	return theatreLocation;
}
public void setTheatreLocation(String theatreLocation) {
	this.theatreLocation = theatreLocation;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public List<Screen> getScreens() {
	return screens;
}
public void setScreens(List<Screen> screens) {
	this.screens = screens;
}


}

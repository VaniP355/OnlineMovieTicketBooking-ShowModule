package com.example.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Show {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int showId;
private String showName;
private String showTime;


@OneToOne(mappedBy = "show",cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
private Movie movie=new Movie();
@JsonIgnore
@ManyToOne(cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
private Screen screen=new Screen();
public Show() {
	super();
}


public Show(String showName, String showTime, Movie movie, Screen screen) {
	super();
	this.showName = showName;
	this.showTime = showTime;
	this.movie = movie;
	this.screen = screen;
}


public Show(int showId, String showName, String showTime, Movie movie, Screen screen) {
	super();
	this.showId = showId;
	this.showName = showName;
	this.showTime = showTime;
	this.movie = movie;
	this.screen = screen;
}


public Screen getScreen() {
	return screen;
}


public void setScreen(Screen screen) {
	this.screen = screen;
}


public int getShowId() {
	return showId;
}
public void setShowId(int showId) {
	this.showId = showId;
}
public String getShowName() {
	return showName;
}
public void setShowName(String showName) {
	this.showName = showName;
}
public String getShowTime() {
	return showTime;
}
public void setShowTime(String showTime) {
	this.showTime = showTime;
}
public Movie getMovie() {
	return movie;
}
public void setMovie(Movie movie) {
	this.movie = movie;
}




}

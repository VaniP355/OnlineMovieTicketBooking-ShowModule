package com.example.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties
public class Screen {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int screenId;
	private int screenNo;
	
	@OneToMany(mappedBy = "screen",cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
	private List<Show> shows=new ArrayList<>();
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
	private Theatre theatre=new Theatre();
	public Screen() {
		super();
	}
	public Screen(int screenNo, List<Show> shows, Theatre theatre) {
		super();
		this.screenNo = screenNo;
		this.shows = shows;
		this.theatre = theatre;
	}
	public Screen(int screenId, int screenNo, List<Show> shows, Theatre theatre) {
		super();
		this.screenId = screenId;
		this.screenNo = screenNo;
		this.shows = shows;
		this.theatre = theatre;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getScreenNo() {
		return screenNo;
	}
	public void setScreenNo(int screenNo) {
		this.screenNo = screenNo;
	}
	public List<Show> getShows() {
		return shows;
	}
	public void setShows(List<Show> shows) {
		this.shows = shows;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	
	
	
	
}

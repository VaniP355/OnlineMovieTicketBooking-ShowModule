package com.example.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int movieId;
	private String movieName;
	private String language;
	private String directorName;
	private String heroName;
	private String heroineName;
	private String duration;
	private String releaseDate;
	private String type;
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
	private Show show;
	public Movie() {
		super();
	}
	public Movie(String movieName, String language, String directorName, String heroName, String heroineName,
			String duration, String releaseDate, String type) {
		super();
		this.movieName = movieName;
		this.language = language;
		this.directorName = directorName;
		this.heroName = heroName;
		this.heroineName = heroineName;
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.type = type;
	}
	public Movie(String movieName) {
		super();
		this.movieName = movieName;
	}
	public Movie(int movieId, String movieName, String language, String directorName, String heroName,
			String heroineName, String duration, String releaseDate, String type) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.directorName = directorName;
		this.heroName = heroName;
		this.heroineName = heroineName;
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.type = type;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getHeroineName() {
		return heroineName;
	}
	public void setHeroineName(String heroineName) {
		this.heroineName = heroineName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	

}

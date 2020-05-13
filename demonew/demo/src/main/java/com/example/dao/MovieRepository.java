package com.example.dao;

import java.net.Inet4Address;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dto.Movie;

public interface MovieRepository  extends JpaRepository<Movie,Integer>{

}

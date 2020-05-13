package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dto.Show;

public interface ShowRepository extends JpaRepository<Show, Integer> {

}

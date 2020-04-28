package com.sprint.movie.dao;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sprint.movie.dto.Movie;
import com.sprint.movie.dto.Show;
public interface ShowDAO extends JpaRepository<Show,Integer>
{
    public Optional<Show> findByMovie(Movie movie);
}

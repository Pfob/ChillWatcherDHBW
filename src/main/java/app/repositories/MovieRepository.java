package app.repositories;

import app.entities.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long>{}
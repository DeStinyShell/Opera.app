package my.projects.spring.service;

import java.util.List;
import my.projects.spring.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}

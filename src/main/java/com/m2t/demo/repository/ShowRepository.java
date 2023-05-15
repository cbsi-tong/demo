package com.m2t.demo.repository;

import com.m2t.demo.model.Show;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShowRepository extends CrudRepository<Show, Integer> {
    List<Show> findByTitle(String title);
}

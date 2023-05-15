package com.m2t.demo.service;

import com.m2t.demo.model.Show;
import com.m2t.demo.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//defining the business logic
@Service
public class ShowService {
    @Autowired
    ShowRepository showRepository;

    public List<Show> getShows() {
        List<Show> shows = new ArrayList<>();
        showRepository.findAll().forEach(show -> shows.add(show));
        return shows;
    }
    public Show getShowById(int id) {
        return showRepository.findById(id).get();
    }
    public void saveOrUpdate(Show show) {
        showRepository.save(show);
    }
    public void delete(int id) {
        showRepository.deleteById(id);
    }

    public void seed() {
        showRepository.save(new Show("Breaking Bad", 2008, 5));
        showRepository.save(new Show("The White Lotus", 2021, 2));
        showRepository.save(new Show("Sons of Anarchy", 2008, 7));
        showRepository.save(new Show("The Office", 2005, 9));
        showRepository.save(new Show("The Sopranos", 1999, 6));
    }
}
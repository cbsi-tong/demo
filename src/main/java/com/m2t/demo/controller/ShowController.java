package com.m2t.demo.controller;

import com.m2t.demo.model.Show;
import com.m2t.demo.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowController {
    @Autowired
    ShowService showService;
    @GetMapping("/shows")
    private List<Show> getShows() {
        return showService.getShows();
    }
    @GetMapping("/shows/{id}")
    private Show getShow(@PathVariable("id") int id) {
        return showService.getShowById(id);
    }
    @DeleteMapping("/shows/{id}")
    private void deleteShow(@PathVariable("id") int id) {
        showService.delete(id);
    }
    @PostMapping("/shows")
    private int saveShow(@RequestBody Show show) {
        showService.saveOrUpdate(show);
        return show.getId();
    }
}

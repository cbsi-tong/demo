package com.m2t.demo;

import com.m2t.demo.model.Show;
import com.m2t.demo.repository.ShowRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class ShowRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ShowRepository repository;

    @Test
    public void testFindByName() {
        entityManager.persist(new Show("Breaking Bad", 2006, 5));
        List<Show> shows = repository.findByTitle("Breaking Bad");
        assertEquals(1, shows.size());
        assertThat(shows).extracting(Show::getTitle).containsOnly("Breaking Bad");
    }
}

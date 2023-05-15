package com.m2t.demo;

import com.m2t.demo.service.ShowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Order(0)
public class ApplicationReadyEventListener {
    @Autowired
    ShowService showService;

    @EventListener
    public void handleApplicationReady(final ApplicationReadyEvent cse) {
        log.debug(">>>>>>>>>>>>> Application Ready <<<<<<<<<<<<<<<<< ");
        showService.seed();
    }
}

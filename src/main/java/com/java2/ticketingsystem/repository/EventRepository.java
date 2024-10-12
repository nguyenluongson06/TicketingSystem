package com.java2.ticketingsystem.repository;

import com.java2.ticketingsystem.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {}

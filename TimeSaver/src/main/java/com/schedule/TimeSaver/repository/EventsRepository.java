package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.EventsEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface EventsRepository extends CrudRepository<EventsEntity, Integer> {
}

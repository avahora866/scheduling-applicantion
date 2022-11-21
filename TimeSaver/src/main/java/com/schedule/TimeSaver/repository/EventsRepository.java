package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.EventsEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EventsRepository extends CrudRepository<EventsEntity, UUID> {
}

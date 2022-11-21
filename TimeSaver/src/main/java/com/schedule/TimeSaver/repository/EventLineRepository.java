package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.EventLineEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EventLineRepository extends CrudRepository<EventLineEntity, UUID> {
}

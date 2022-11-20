package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.EventLineEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface EventLineRepository extends CrudRepository<EventLineEntity, Integer> {
}

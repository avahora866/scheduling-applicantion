package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.TaskLineEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface TaskLineRepository extends CrudRepository<TaskLineEntity, Integer> {
}

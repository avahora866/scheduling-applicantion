package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.TasksEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface TasksRepository extends CrudRepository<TasksEntity, Integer> {
}

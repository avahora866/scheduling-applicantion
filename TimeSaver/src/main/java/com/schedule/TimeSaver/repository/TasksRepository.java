package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.TasksEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TasksRepository extends CrudRepository<TasksEntity, UUID> {
}

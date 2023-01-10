package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.ListLineEntity;
import com.schedule.TimeSaver.entity.TaskLineEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface TaskLineRepository extends CrudRepository<TaskLineEntity, UUID> {
    Optional<TaskLineEntity> findByUser(UsersEntity user);

}

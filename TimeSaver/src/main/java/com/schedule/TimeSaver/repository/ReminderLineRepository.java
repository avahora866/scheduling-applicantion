package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.ReminderLineEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ReminderLineRepository extends CrudRepository<ReminderLineEntity, UUID> {
}

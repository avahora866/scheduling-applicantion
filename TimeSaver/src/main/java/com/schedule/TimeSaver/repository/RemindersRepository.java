package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.RemindersEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface RemindersRepository extends CrudRepository<RemindersEntity, UUID> {
}

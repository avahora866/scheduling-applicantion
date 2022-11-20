package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.RemindersEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface RemindersRepository extends CrudRepository<RemindersEntity, Integer> {
}

package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.ListLineEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface ListLineRepository extends CrudRepository<ListLineEntity, Integer> {
}

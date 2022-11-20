package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.ListEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface ListRepository extends CrudRepository<ListEntity, Integer> {
}

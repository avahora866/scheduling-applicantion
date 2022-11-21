package com.schedule.TimeSaver.repository;

import com.schedule.TimeSaver.entity.ListEntity;
import com.schedule.TimeSaver.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ListRepository extends CrudRepository<ListEntity, UUID> {
}

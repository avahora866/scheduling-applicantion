package com.schedule.TimeSaver.response;

import com.schedule.TimeSaver.entity.EventsEntity;
import com.schedule.TimeSaver.entity.ListLineEntity;
import com.schedule.TimeSaver.entity.TasksEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ListResponse {

    private Integer listID;

    private String name;

    private ListLineEntity listLine;

    private List<TasksEntity> tasks;

    private List<EventsEntity> events;

    public ListResponse(String name) {
        this.name = name;
    }

    public ListResponse(Integer listID, String name, ListLineEntity listLine, List<TasksEntity> tasks, List<EventsEntity> events) {
        this.listID = listID;
        this.name = name;
        this.listLine = listLine;
        this.tasks = tasks;
        this.events = events;
    }
}

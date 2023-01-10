package com.schedule.TimeSaver.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.schedule.TimeSaver.entity.ListEntity;
import com.schedule.TimeSaver.entity.TaskLineEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class TaskDetails {

    private Integer userId;

    private String name;

    private String listName;

    private String description;

    private String color;

    private Boolean repeating;

    private LocalDateTime date;

}

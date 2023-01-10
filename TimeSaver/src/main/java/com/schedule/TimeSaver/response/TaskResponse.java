package com.schedule.TimeSaver.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class TaskResponse {

    private String name;

    private String description;

    private String color;

    private Boolean repeating;

    private LocalDateTime date;

    public TaskResponse(String name, String description, String color, Boolean repeating, LocalDateTime date) {
        this.name = name;
        this.description = description;
        this.color = color;
        this.repeating = repeating;
        this.date = date;
    }
}

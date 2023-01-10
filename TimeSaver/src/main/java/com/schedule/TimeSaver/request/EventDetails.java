package com.schedule.TimeSaver.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class EventDetails {

    private Integer userId;

    private String name;

    private String listName;

    private String description;

    private String color;

    private Boolean repeating;

    private LocalDateTime date;

}

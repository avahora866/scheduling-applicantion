package com.schedule.TimeSaver.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
public class EventsEntity {
    @Id
    @Column(name = "EVENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventID;

    @ManyToOne
    @JoinColumn(name="EVENT_LINE_ID")
    private EventLineEntity eventLine;

    //TODO: Need to reflect this change on ERD
    @ManyToOne
    @JoinColumn(name="LIST_ID")
    private ListEntity list;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "REPEATING")
    private Boolean repeating;

    @Column(name = "DATE")
    private LocalDateTime date;

    public EventsEntity(EventLineEntity eventLine, ListEntity list, String name, String description, String color, Boolean repeating, LocalDateTime date) {
        this.eventLine = eventLine;
        this.list = list;
        this.name = name;
        this.description = description;
        this.color = color;
        this.repeating = repeating;
        this.date = date;
    }
}

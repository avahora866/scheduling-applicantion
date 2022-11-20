package com.schedule.TimeSaver.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "eventline")
@Getter
@Setter
@NoArgsConstructor
public class EventLineEntity {
    @Id
    @Column(name = "EVENT_LINE_ID")
    private UUID eventLineID;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private UsersEntity user;

    //mappedBy is the variable name in lists
    @OneToMany(mappedBy = "eventLine")
    private List<EventsEntity> events;

}

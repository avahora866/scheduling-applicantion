package com.schedule.TimeSaver.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "list")
@Getter
@Setter
@NoArgsConstructor
public class ListEntity {
    @Id
    @Column(name = "LIST_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer listID;

    @ManyToOne
    @JoinColumn(name="LIST_LINE_ID")
    private ListLineEntity listLine;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "list")
    private List<TasksEntity> tasks;

    @OneToMany(mappedBy = "list")
    private List<EventsEntity> events;
}

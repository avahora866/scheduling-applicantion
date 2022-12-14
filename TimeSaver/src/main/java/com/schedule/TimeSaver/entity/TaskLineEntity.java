package com.schedule.TimeSaver.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "taskline")
@Getter
@Setter
@NoArgsConstructor
public class TaskLineEntity {
    @Id
    @Column(name = "TASK_LINE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskLineID;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private UsersEntity user;

    //mappedBy is the variable name in lists
    @OneToMany(mappedBy = "taskLine")
    private List<TasksEntity> tasks;

    public TaskLineEntity(UsersEntity user) {
        this.user = user;
    }
}

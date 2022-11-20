package com.schedule.TimeSaver.entity;

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
    private UUID taskLineID;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private UsersEntity user;

    //mappedBy is the variable name in lists
    @OneToMany(mappedBy = "taskLine")
    private List<TasksEntity> tasks;

}

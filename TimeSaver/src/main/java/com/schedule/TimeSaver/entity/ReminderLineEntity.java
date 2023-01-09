package com.schedule.TimeSaver.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "reminderline")
@Getter
@Setter
@NoArgsConstructor
public class ReminderLineEntity {
    @Id
    @Column(name = "REMINDER_LINE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reminderLineID;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private UsersEntity user;

    //mappedBy is the variable name in lists
    @OneToMany(mappedBy = "reminderLine")
    private List<RemindersEntity> reminders;

    public ReminderLineEntity(UsersEntity user) {
        this.user = user;
    }
}

package com.schedule.TimeSaver.entity;

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
    private UUID reminderLineID;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private UsersEntity user;

    //mappedBy is the variable name in lists
    @OneToMany(mappedBy = "reminderLine")
    private List<RemindersEntity> reminders;

}

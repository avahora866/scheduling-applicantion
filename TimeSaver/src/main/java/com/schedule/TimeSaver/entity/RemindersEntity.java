package com.schedule.TimeSaver.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "reminders")
@Getter
@Setter
@NoArgsConstructor
public class RemindersEntity {
    @Id
    @Column(name = "REMINDER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reminderID;

    @ManyToOne
    @JoinColumn(name="reminder_LINE_ID")
    private ReminderLineEntity reminderLine;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "REPEATING")
    private Boolean repeating;

    @Column(name = "DATE")
//    @DateTimeFormat(pattern="dd/MM/yyyy")
    private LocalDateTime date;

}

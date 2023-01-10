package com.schedule.TimeSaver.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    public RemindersEntity(ReminderLineEntity reminderLine, String name, String description, String color, Boolean repeating, LocalDateTime date) {
        this.reminderLine = reminderLine;
        this.name = name;
        this.description = description;
        this.color = color;
        this.repeating = repeating;
        this.date = date;
    }
}

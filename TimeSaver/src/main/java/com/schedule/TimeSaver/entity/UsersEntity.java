package com.schedule.TimeSaver.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class UsersEntity {
    @Id
    @Column(name = "USER_ID")
    private UUID userID;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @OneToOne(mappedBy = "user")
    private TaskLineEntity taskLine;

    @OneToOne(mappedBy = "user")
    private ReminderLineEntity reminderLine;

    @OneToOne(mappedBy = "user")
    private ListLineEntity listLine;

    @OneToOne(mappedBy = "user")
    private EventLineEntity eventLine;
}

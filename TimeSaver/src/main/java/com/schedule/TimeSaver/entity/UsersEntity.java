package com.schedule.TimeSaver.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID;

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

    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private TaskLineEntity taskLine;

    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private ReminderLineEntity reminderLine;

    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private ListLineEntity listLine;

    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private EventLineEntity eventLine;

    public UsersEntity(String firstName, String lastName, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }
}

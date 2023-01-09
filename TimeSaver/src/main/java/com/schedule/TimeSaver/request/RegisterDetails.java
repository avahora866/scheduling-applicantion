package com.schedule.TimeSaver.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
public class RegisterDetails {

    private String firstName;

    private String lastName;

    private String email;

    private String username;

    private String password;
}

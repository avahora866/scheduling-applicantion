package com.schedule.TimeSaver.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserResponse {
    private Integer userID;

    private String firstName;

    private String lastName;

    private String email;

    private String username;

    private String password;


    public UserResponse(Integer userID, String firstName, String lastName, String email, String username, String password) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }
}

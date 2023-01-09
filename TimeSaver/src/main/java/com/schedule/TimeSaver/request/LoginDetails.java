package com.schedule.TimeSaver.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginDetails {
    private String userName;
    private String email;
    private String password;

}

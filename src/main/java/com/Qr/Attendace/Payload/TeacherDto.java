package com.Qr.Attendace.Payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TeacherDto {
    private Integer TeacherId;
    private String name;
    private String username;
    private String password;
    private SubjectDto subject;
}

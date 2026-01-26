package com.Qr.Attendace.Payload;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class AttendanceDto {
    private Integer AttendanceId;

    private Date date;
    private boolean status;

    private SubjectDto subject;

    private StudentDto student;
}

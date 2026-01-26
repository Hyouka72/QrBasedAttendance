package com.Qr.Attendace.Payload;


import java.util.Date;

public class AttendanceDto {
    private Integer AttendanceId;

    private Date date;
    private boolean status;

    private SubjectDto subject;

    private StudentDto student;
}

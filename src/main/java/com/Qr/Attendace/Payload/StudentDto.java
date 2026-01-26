package com.Qr.Attendace.Payload;

import com.Qr.Attendace.Model.Attendance;

import java.util.List;

public class StudentDto {
    private Integer StudentId;

    private String name;
    private String userName;
    private String password;
    private String semester;

    private List<AttendanceDto> attendances;
}

package com.Qr.Attendace.Payload;

import java.util.List;

public class SubjectDto {
    private Integer StudentId;

    private String name;
    private String code;

    private TeacherDto teacher;
    private List<AttendanceDto> attendances;
}

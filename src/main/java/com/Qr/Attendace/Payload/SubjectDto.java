package com.Qr.Attendace.Payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SubjectDto {
    private Integer StudentId;

    private String name;
    private String code;

    private TeacherDto teacher;
    private List<AttendanceDto> attendances;
}

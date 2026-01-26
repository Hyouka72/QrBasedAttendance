package com.Qr.Attendace.Payload;

import com.Qr.Attendace.Model.Attendance;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class StudentDto {
    private Integer StudentId;

    private String name;
    private String userName;
    private String password;
    private String semester;

    private List<AttendanceDto> attendances;
}

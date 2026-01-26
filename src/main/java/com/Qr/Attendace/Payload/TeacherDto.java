package com.Qr.Attendace.Payload;

import com.Qr.Attendace.Model.Subject;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class TeacherDto {
    private Integer TeacherId;
    private String Name;
    private String Username;
    private String Password;
    private SubjectDto subject;
}

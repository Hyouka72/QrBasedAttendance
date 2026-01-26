package com.Qr.Attendace.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer StudentId;

    private String name;
    private String code;

    @OneToOne(mappedBy = "subject")
    private Teacher teacher;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
    private java.util.List<Attendance> attendances;

    // getters and setters
}
package com.Qr.Attendace.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer TeacherId;
    private String Name;
    private String Username;
    private String Password;

    @OneToOne
    @JoinColumn(name = "subject_id", unique = true) // foreign key column in Teacher table
    private Subject subject;

}

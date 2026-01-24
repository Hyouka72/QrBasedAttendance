package com.Qr.Attendace.Repository;

import com.Qr.Attendace.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

package com.Qr.Attendace.Controller;

import com.Qr.Attendace.Model.Student;
import com.Qr.Attendace.Payload.StudentDto;
import com.Qr.Attendace.Service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }

    @PostMapping("/")
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto){
        StudentDto newStudent = this.service.CreateStudent(studentDto);
        return new ResponseEntity<>(newStudent,HttpStatus.CREATED);

    }
}

package com.Qr.Attendace.Controller;

import com.Qr.Attendace.Model.Student;
import com.Qr.Attendace.Payload.StudentDto;
import com.Qr.Attendace.Service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/")
    public ResponseEntity<List<StudentDto>> findAllStudent() {
        List<StudentDto> listStudent = this.service.showAllStudent();
        return new ResponseEntity<>(listStudent, HttpStatus.OK);
    }

}

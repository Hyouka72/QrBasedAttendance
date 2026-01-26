package com.Qr.Attendace.Controller;

import com.Qr.Attendace.Payload.TeacherDto;
import com.Qr.Attendace.Service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    private TeacherService service;

    public TeacherController(TeacherService service){
        this.service = service;
    }


    @PostMapping("/")
    public ResponseEntity<TeacherDto>  createTeacher(@RequestBody TeacherDto teacherDto){
        TeacherDto newTeacher = this.service.createTeacher(teacherDto);
                return  new ResponseEntity<>(newTeacher, HttpStatus.CREATED);

    }
}

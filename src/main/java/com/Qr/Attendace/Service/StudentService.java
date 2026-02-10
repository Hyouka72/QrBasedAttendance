package com.Qr.Attendace.Service;

import com.Qr.Attendace.Model.Student;
import com.Qr.Attendace.Payload.StudentDto;
import com.Qr.Attendace.Repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final ModelMapper modelMapper;
    private final  StudentRepository repo;
    public StudentService(StudentRepository repo, ModelMapper modelMapper){
        this.repo = repo;
        this.modelMapper = modelMapper;
    }


    public StudentDto CreateStudent(StudentDto student){
        Student newStudent = this.modelMapper.map(student, Student.class);
        Student savedUser = this.repo.save(newStudent);
        return this.modelMapper.map(savedUser,StudentDto.class);
    }

    public List<StudentDto> showAllStudent() {
        List<Student> allStudents = this.repo.findAll();
        return allStudents.stream()
                .map(student -> this.modelMapper.map(student, StudentDto.class))
                .collect(Collectors.toList());
    }

}

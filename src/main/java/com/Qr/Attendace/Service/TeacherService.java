package com.Qr.Attendace.Service;

import com.Qr.Attendace.Model.Teacher;
import com.Qr.Attendace.Payload.TeacherDto;
import com.Qr.Attendace.Repository.TeacherRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private final ModelMapper modelMapper;

    private final TeacherRepository repository;

    private TeacherService(ModelMapper modelMapper, TeacherRepository repository){
        this.modelMapper = modelMapper;
        this.repository = repository;
    }

    public TeacherDto createTeacher(TeacherDto teacherDto){
        Teacher teacher = this.modelMapper.map(teacherDto, Teacher.class);
        Teacher newteacher = this.repository.save(teacher);
        return this.modelMapper.map(newteacher, TeacherDto.class);
    }


}

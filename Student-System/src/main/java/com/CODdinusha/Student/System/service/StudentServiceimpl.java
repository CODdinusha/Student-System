package com.CODdinusha.Student.System.service;

import com.CODdinusha.Student.System.model.Student;
import com.CODdinusha.Student.System.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceimpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}

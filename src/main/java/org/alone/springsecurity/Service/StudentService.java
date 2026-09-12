package org.alone.springsecurity.Service;

import org.alone.springsecurity.Entity.Student;
import org.alone.springsecurity.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }





}

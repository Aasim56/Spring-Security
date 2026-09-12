package org.alone.springsecurity.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.alone.springsecurity.Entity.Student;
import org.alone.springsecurity.Service.StudentService;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/student")
    public List<Student> getStudents(Student student){
        return studentService.getStudent();
    }

    @GetMapping("/csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/greet")
    public String greet(){
        return " Welcome to Spring Security";
    }

}


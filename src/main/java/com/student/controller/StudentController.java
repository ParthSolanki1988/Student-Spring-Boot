package com.student.controller;


import com.student.dto.StudentDTO;
import com.student.entity.Student;
import com.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

  @Autowired
  StudentRepository studentRepository;
  private PasswordEncoder passwordEncoder;
  @RequestMapping("/save")
  public void saveStudent(){
    passwordEncoder = new BCryptPasswordEncoder();

    Student student = new Student(
            1,
            "Parth",
            "Parth@gmail.com",

            this.passwordEncoder.encode("1234")
    );
   studentRepository.save(student);
  }
}

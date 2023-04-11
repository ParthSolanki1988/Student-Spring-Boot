package com.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
  private int studentId;

  private String studentName;

  private String studentEmail;

  private String password;


}

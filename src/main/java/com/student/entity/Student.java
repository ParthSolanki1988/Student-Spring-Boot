package com.student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int studentId;

  private String studentName;

  private String studentEmail;

  private String password;



}

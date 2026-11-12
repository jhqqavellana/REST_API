package com.spring.spring_rest.service;

import java.util.List;

import com.spring.spring_rest.dto.StudentDto;

public interface StudentService {
  List<StudentDto> createStudent(List<StudentDto> theStudentDtos);
  StudentDto getStudentById(Long theId);
  List<StudentDto> getAllStudents();
  StudentDto updateStudent(Long theId, StudentDto theStudentDto);
  StudentDto patchStudent(Long theId, StudentDto theStudentDto);
  void deleteStudentById(Long theId);
}

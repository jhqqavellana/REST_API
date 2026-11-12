package com.spring.spring_rest.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StudentDto {

  private Long id;

  @NotBlank(message = "Must be 2 to 50 characters.")
  @Size(min = 2, max = 50, message = "Must be 2 to 50 characters.")
  private String firstName;

  @NotBlank(message = "Must be 2 to 50 characters.")
  @Size(min = 2, max = 50, message = "Must be 2 to 50 characters.")
  private String lastName;

  @NotBlank(message = "Email is required and should be valid")
  @Email(message = "Email is required and should be valid")
  private String email;

  public StudentDto() {
  }

  public StudentDto(Long id, String firstName, String lastName, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "StudentDto [id=" + id + ", firstName=" + firstName
        + ", lastName=" + lastName
        + ", email=" + email + "]";
  }
}
package com.example.task2.Entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="EmployeeDatabase")
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;
}

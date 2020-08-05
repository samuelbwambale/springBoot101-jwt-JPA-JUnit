package com.example.spring_101.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private long id;

    @Size(min = 3, message = "FirstName should be atleast 3 charachters")
    @NotBlank(message = "FirstName is mandatory")
    private String firstname;

    @Size(min = 3, message = "FirstName should be atleast 3 charachters")
    @NotBlank(message = "FirstName is mandatory")
    private String lastname;
}

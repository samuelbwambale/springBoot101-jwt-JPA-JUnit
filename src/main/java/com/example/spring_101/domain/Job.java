package com.example.spring_101.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Size(min = 4)
    private String title;

    @NotNull
    @Size(min = 3)
    private String employer;

    @NotNull
    @Size(min = 5)
    private String description;

}

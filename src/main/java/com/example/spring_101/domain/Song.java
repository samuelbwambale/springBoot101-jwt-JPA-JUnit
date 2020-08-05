package com.example.spring_101.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {

    @javax.persistence.Id
    @GeneratedValue
    private long id;

    @NotNull
    @Size(min=3, max=20)
    private String name;

    @NotNull
    @Size(min=3, max=20)
    private String artist;

    @NotNull
    @Size(min=3, max=20)
    private String album;

    @NotBlank(message = "Rating is mandatory")
    private int rating;
    private int year;
}

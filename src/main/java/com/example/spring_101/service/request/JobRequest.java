package com.example.spring_101.service.request;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@ToString
public class JobRequest {
    @NotBlank(message = "Title is mandatory")
    @Size(min = 4, message = "Minimum length of title should be 4 charachters")
    private String title;
    @NotBlank(message = "Employer is mandatory")
    @Size(min = 3, message = "Minimum length of employer should be 4 charachters")
    private String employer;
    @NotBlank(message = "Description is mandatory")
    @Size(min = 3, message = "Minimum length of description should be 4 charachters")
    private String description;
}
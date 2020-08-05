package com.example.spring_101.repository;

import com.example.spring_101.domain.Job;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class JobRepositoryTests {

    @Autowired
    JobRepository jobRepository;

    @Test
    public void testJobRepository() {
        Job job1 = new Job();
        job1.setTitle("Java Developer");
        job1.setEmployer("Capital One");
        job1.setDescription("Build Spring Boot apps");

        Job job2 = new Job();
        job2.setTitle("Quality Assurance");
        job2.setEmployer("Capital One");
        job2.setDescription("Test the applications");

        //This tests if the database saves the Job data
        Job savedJob1 = jobRepository.save(job1);
        assertEquals(savedJob1.getTitle(), "Java Developer");

        Job savedJob2 = jobRepository.save(job2);

        List<Job> savedJobs = new ArrayList<>();
        savedJobs = jobRepository.findAll();
//        assertEquals(1, jobRepository.findAll().size());




    }
}

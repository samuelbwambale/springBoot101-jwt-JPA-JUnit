package com.example.spring_101.controller;

import com.example.spring_101.domain.Job;
import com.example.spring_101.service.JobService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class JobControllerTests {

    @Mock
    JobService jobService;

    @InjectMocks
    JobController jobController;

    Job job1 = new Job(1,"Software Developer", "KiteString", "Develop web apps");
    Job job2 = new Job(2,"Quality Assurance", "KiteString", "Test the applications");
    private List<Job> allJobs = Arrays.asList(job1, job2);


    @Test
    public void testGetAllJobs() {

        when(jobService.getAllJobs()).thenReturn(allJobs);
        List<Job> responseJobs = jobController.getAllJobs();
        assertNotNull(responseJobs);
        assertTrue(responseJobs.size() > 0
        );
        assertEquals(allJobs, responseJobs);
    }

    @Test
    void testSaveJob() {
        when(jobService.saveJob(allJobs.get(1))).thenReturn(allJobs.get(1));
        assertEquals(allJobs.get(1), jobService.saveJob(allJobs.get(1)));
    }


}

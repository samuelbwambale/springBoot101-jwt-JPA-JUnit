package com.example.spring_101.service;

import com.example.spring_101.domain.Job;

import java.util.List;

public interface JobService {

    public List<Job> getAllJobs();

    Job getJobById(Long id) throws Exception;

    Job getJobByTitle(String title) throws Exception;

    Job saveJob(Job job);

    Job updateJob(Long id, Job jobDetails) throws Exception;

    void deleteJob(Long id) throws Exception;

}

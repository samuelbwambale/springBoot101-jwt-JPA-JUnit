package com.example.spring_101.service;

import com.example.spring_101.domain.Job;
import com.example.spring_101.exception.BusinessException;
import com.example.spring_101.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;
    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public Job getJobById(Long id) throws BusinessException {
        return jobRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Job not with id = " + id + " not foung"));
    }

    @Override
    public Job getJobByTitle(String title) throws BusinessException {

        Job job = jobRepository.findByTitle(title);
        if(job == null) {
            throw new BusinessException("Job with title " + title + " not found");
        }
        return job;
    }

    @Override
    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public Job updateJob(Long id, Job jobDetails) throws BusinessException {
        Job job = jobRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Job not with id = " + id + " not foung"));
        job.setTitle(jobDetails.getTitle());
        job.setEmployer(jobDetails.getEmployer());
        job.setDescription(jobDetails.getDescription());
        return jobRepository.save(job);
    }

    @Override
    public void deleteJob(Long id) throws Exception {
        Job job = jobRepository.findById(id)
                .orElseThrow(() -> new Exception("Job not found on :: " + id));
        jobRepository.delete(job);
    }
}

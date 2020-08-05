package com.example.spring_101.controller;

import com.example.spring_101.domain.Job;
import com.example.spring_101.service.JobService;
import com.example.spring_101.service.request.JobRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public Job getJobById(@PathVariable Long id) throws Exception {
//        return jobService.getJobById(id);
//    }

    @GetMapping("/{id}")
    public Job getSingleJob(@PathVariable Long id) throws Exception{
        System.out.println("@GetMapping()");
        return jobService.getJobById(id);
    }

    @GetMapping("/title")
    public Job getJobByTitle(@RequestParam(value="title") String title) throws Exception {
        return jobService.getJobByTitle(title);
    }

    @PostMapping
    public Job saveCountry(@RequestBody Job jobDetails) {
        return jobService.saveJob(jobDetails);
    }

//    @PostMapping
//    public Job saveJob(@Valid @RequestBody JobRequest) {
//        return jobService.saveJob(JobRequest);
//    }

    @PutMapping("/{id}")
    public Job updateJob(@PathVariable Long id, @RequestBody Job jobDetails) throws Exception {
        return jobService.updateJob(id, jobDetails);
    }

    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable Long id) throws Exception {
        jobService.deleteJob(id);
        return "Job successfully deleted";
    }

}

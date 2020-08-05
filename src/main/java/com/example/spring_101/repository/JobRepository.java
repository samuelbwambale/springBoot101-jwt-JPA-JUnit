package com.example.spring_101.repository;

import com.example.spring_101.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

    Job findByTitle(String title);
}

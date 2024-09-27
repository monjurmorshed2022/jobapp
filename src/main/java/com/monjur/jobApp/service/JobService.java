package com.monjur.jobApp.service;

import java.util.List;

import com.monjur.jobApp.model.JobPost;
import com.monjur.jobApp.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class JobService {
  @Autowired
  private JobRepository repo;

  /*--------- For Fetching All Jobs ------------*/
  public List<JobPost> returnAllJobPosts() {
    return repo.returnAllJobPosts();
  }
  /*--------- For Fetching All Jobs ------------*/

  /*--------- For Adding New Jobs --------------*/
  public void addJobPost(JobPost jobPost) {
    repo.addJobPost(jobPost);
  }
  /*--------- For Adding New Jobs --------------*/
}

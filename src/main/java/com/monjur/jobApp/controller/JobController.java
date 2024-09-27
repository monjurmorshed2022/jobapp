package com.monjur.jobApp.controller;

import com.monjur.jobApp.model.JobPost;
import com.monjur.jobApp.service.JobService;
import java.security.SecureRandom;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {
  @Autowired
  private JobService service;

  /*--------- For Home ------------------------*/
  @GetMapping({ "/", "/home" })
  public String home() {
    return "home";
  }

  /*--------- For Home ------------------------*/

  /*--------- For Add Job ---------------------*/
  @GetMapping("/addjob")
  public String addJob() {
    return "addjob";
  }

  /*--------- For Add Job ----------------------*/

  /*--------- For Fetching All Jobs ------------*/
  @GetMapping("/viewalljobs")
  public String viewJobs(Model model) {
    List<JobPost> jobPosts = service.returnAllJobPosts();
    model.addAttribute("jobPosts", jobPosts);
    return "viewalljobs";
  }

  /*--------- For Fetching All Jobs ------------*/

  /*--------- For Adding New Jobs --------------*/
  @PostMapping("handleForm")
  public String handleForm(JobPost jobPost, Model model) {
    model.addAttribute("jobPost", jobPost);
    service.addJobPost(jobPost);
    return "success";
  }
  /*--------- For Adding New Jobs --------------*/
}

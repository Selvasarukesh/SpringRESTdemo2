package com.example.SpringRESTdemo2.controller;

import com.example.SpringRESTdemo2.model.Employee;
import com.example.SpringRESTdemo2.model.JobPost;
import com.example.SpringRESTdemo2.repo.EmployeeRepo;
import com.example.SpringRESTdemo2.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class RESTController {

    @Autowired
    private JobService service;



    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("/jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        return service.getJob(postId);
    }

    @PostMapping("jobPost")
    public List<JobPost> addAllJobs(@RequestBody JobPost jobPost) {
        return service.addJobPost(jobPost);
    }

    @PutMapping("jobPost")
    public JobPost updateAllJobs(@RequestBody JobPost jobPost) {
         service.updateJobPost(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("/jobPost/{postId}")
    public String deleteJob(@PathVariable int postId) {
        service.deleteJob(postId);
        return "Job Post with id " + postId + " deleted successfully";
    }


}

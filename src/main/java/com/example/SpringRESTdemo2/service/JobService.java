package com.example.SpringRESTdemo2.service;

import com.example.SpringRESTdemo2.model.JobPost;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JobService {

    //method to return all JobPosts
    public List<JobPost> getAllJobs() ;

    // method to add a jobPost
    public List<JobPost> addJobPost(JobPost jobPost) ;

    // method to add a jobPost
    public void updateJobPost(JobPost jobPost) ;

    public JobPost getJob(int postId) ;

    public void deleteJob(int postId) ;

}

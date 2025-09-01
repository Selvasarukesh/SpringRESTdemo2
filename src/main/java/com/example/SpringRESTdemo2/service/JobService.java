package com.example.SpringRESTdemo2.service;

import com.example.SpringRESTdemo2.model.JobPost;
import com.example.SpringRESTdemo2.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JobService {



    //method to return all JobPosts
    public List<JobPost> getAllJobs() ;


    // method to add a jobPost
    public void addJobPost(JobPost jobPost) ;





    public JobPost getJob(int postId) ;
}

package com.demo.repo.controller;

import com.demo.repo.model.Book;
import com.demo.repo.model.JobTest;
import com.demo.repo.service.jobTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jobs")
public class jobTestController {

    @Autowired
    jobTestService js;

    @GetMapping("/")
    public Map<String,Object> jobs()
    {
        return js.getjobs();
    }
    @GetMapping("/all")
    public List<JobTest> getAllJobs()
    {
        return js.getAllJobs();
    }
}

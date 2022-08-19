package com.demo.repo.service;

import com.demo.repo.model.Book;
import com.demo.repo.model.JobTest;
import com.demo.repo.repository.jobTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class jobTestService {

    @Autowired
    jobTestRepository tr;

    public Map<String, Object> getjobs() {
        Map<String,Object> res=new HashMap<String,Object>();
        List<JobTest> job=tr.getjobs();
        res.put("data",job);
        return res;
    }

    public List<JobTest> getAllJobs() {
        return tr.findAll();
    }
}

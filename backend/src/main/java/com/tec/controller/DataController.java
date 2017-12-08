package com.tec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tec.model.SomeData;
import com.tec.service.SomeDataService;

@RestController
public class DataController {
    
    @Autowired
    private SomeDataService someDataService;
    
    @RequestMapping(value="/data")
    public List<SomeData> getAllData() {
        return someDataService.getAllData();
    }

}

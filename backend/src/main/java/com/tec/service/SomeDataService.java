package com.tec.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.tec.model.SomeData;


@Service
public class SomeDataService {
    
    private List<SomeData> datas = new ArrayList<>();
    
    {
        datas.add(new SomeData(3150, "q", "w", "a", 12, "s", "x", 13, "fp", "origin", 14, "destination", 15, "truckD", "length", "weight", "company", "phone"));
    }
    
    public List<SomeData> getAllData(){
        return datas;
    }

}

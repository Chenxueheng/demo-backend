package com.example.demovue.controller;

import com.alibaba.fastjson.JSON;
import com.example.demovue.bean.MainTable;
import com.example.demovue.dao.MainTableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class MainTableController {
    @Autowired
    MainTableDao mainTableDao;
    
    @RequestMapping("/table")
    public String getTableList(){
        System.out.println("执行到这了");
        List<MainTable> list = mainTableDao.getTableList();
        HashMap<String,Object> data = new HashMap<>();
        data.put("TableList",list);
        String s = JSON.toJSONString(data);
        return s;
    }
}

package com.example.demovue.dao;

import com.example.demovue.bean.MainTable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainTableDao {
    public List<MainTable> getTableList();
}

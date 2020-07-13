package com.example.demovue.dao;

import com.example.demovue.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {
    public List<MainMenu> getMenus();
}

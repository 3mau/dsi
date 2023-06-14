package com.restaurante.dsi.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.restaurante.dsi.model.Tables;
import com.restaurante.dsi.model.User;

public interface ITableService {

  public List<Tables> findAll();
  public Tables save(Tables table);
  public Tables update(Tables currentTable,Tables table);
  public Tables findById(Long id);
  public void delete(Long id);
    
} 

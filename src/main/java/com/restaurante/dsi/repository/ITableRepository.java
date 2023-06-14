package com.restaurante.dsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurante.dsi.model.Tables;

@Repository
public interface ITableRepository extends JpaRepository<Tables, Long>{
    
} 
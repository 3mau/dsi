package com.restaurante.dsi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.dsi.model.Tables;
import com.restaurante.dsi.model.User;
import com.restaurante.dsi.service.ITableService;

import jakarta.validation.Valid;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/table")
public class TableRestController {
@Autowired
private ITableService tableService;
@GetMapping("/")

 public List<Tables> listar(){

    return tableService.findAll() ;

 }
  @PostMapping("/registert")
  public Tables registert(@RequestBody @Valid Tables table) {
    return tableService.save(table);
  }
  @PutMapping("/update/{id}")
  public Tables update(@PathVariable Long id, @RequestBody Tables table) {
       Tables currTable=tableService.findById(id);
    return tableService.update(currTable,table);
  }
  @GetMapping("/findt/{id}")
  public ResponseEntity<Tables> getMesaById(@PathVariable Long id) {
        Tables table = tableService.findById(id);
        if (table != null) {
          return ResponseEntity.ok(table);
        } else {
          return ResponseEntity.notFound().build();
        }


    }
  @DeleteMapping("/deletet/{id}")
  public void delete(@PathVariable Long id) {
        tableService.delete(id);
    }

    
}
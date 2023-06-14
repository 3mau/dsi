package com.restaurante.dsi.service.iml;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.restaurante.dsi.middlewares.CustomExceptionHandler;
import com.restaurante.dsi.model.Tables;
import com.restaurante.dsi.model.User;
import com.restaurante.dsi.repository.ITableRepository;
import com.restaurante.dsi.service.ITableService;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service("TablesService")
public class TableServiceImpl implements ITableService  {
    @Autowired
  private ITableRepository tableRepository;

  @Override
  public List<Tables> findAll() {
    return tableRepository.findAll();
  }

  @Override
  @Transactional
  public Tables save(Tables table) {
    try {
      return tableRepository.save(table);
    } catch (DataIntegrityViolationException ex) {
      throw new CustomExceptionHandler.DataIntegrityException("Ya existe un usuario con ese username.");
    }
  }

   @Override
    @Transactional
    public Tables update(Tables currentTable, Tables table) {
        try {
            if(table.getCapacity()!=null){
                currentTable.setCapacity(table.getCapacity());
            }
            if(table.getDescription()!=null){
                currentTable.setDescription(table.getDescription());
            }
            return tableRepository.save(currentTable);
        } catch (DataIntegrityViolationException ex) {
            throw new CustomExceptionHandler.DataIntegrityException("Ya existe un usuario con ese username.");
        }

    }
  @Override
  public Tables findById(Long id) {
    return tableRepository.findById(id).orElse(null)  ;
  }

  @Override
  public void delete(Long id) {
  }

    
}

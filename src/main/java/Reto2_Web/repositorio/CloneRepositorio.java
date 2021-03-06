/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.InterfaceClone;
import Reto2_Web.modelo.Clone;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class CloneRepositorio {
    @Autowired
    private InterfaceClone repository;

    public List<Clone> getAll() {
        return repository.findAll();
    }

    public Optional<Clone> getClothe(Integer id) {
        return repository.findById(id);
    }
    public Clone create(Clone clothe) {
        return repository.save(clothe);
    }

    public void update(Clone clothe) {
        repository.save(clothe);
    }
    
    public void delete(Clone clothe) {
        repository.delete(clothe);
    }
}

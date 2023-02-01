package com.dopl.pokemon.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface BasicControllerMethod <T > {
    ResponseEntity<Object> create(T entity);
    ResponseEntity<Object> findAll();
    ResponseEntity<Object> updateById(T newEntity , Long id );
    ResponseEntity<Object>  findById(Long id);
    ResponseEntity<Boolean> delete(@PathVariable Long id);
}

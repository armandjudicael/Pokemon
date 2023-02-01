package com.dopl.pokemon.service;

import com.dopl.pokemon.entity.Pokemon;

import java.util.List;

public interface BasicServiceMethod<T> {

   List<T> saveAll(List<T> object);
   T create(T object);
   T updateById (Long id);

   T update(T object,Long id);

   Boolean deleteById(Long id);

   Boolean delete(T obejct);
   List<T> findAll();

   T findById(Long id);
}

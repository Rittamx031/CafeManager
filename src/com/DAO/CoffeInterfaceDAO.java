/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.DAO;

import java.util.List;

/**
 *
 * @author 121200
 */
public interface CoffeInterfaceDAO<EntityType, KeyType> {
    abstract public void insert(EntityType entity);
    abstract public void update(EntityType entity);
    abstract public void delete(String id);
    abstract public EntityType SelectById(KeyType id);
    abstract public EntityType SelectByTen();
    abstract public List<EntityType> selectAll();
    abstract List<EntityType> selectBySql(String sql,Object...args);
}

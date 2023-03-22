/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermarket.DAO;

import java.util.List;

/**
 *
 * @author trinh duy bao
 */
public abstract class MainDAO<EntityType, Key> {
    public abstract void insert(EntityType entity);
    public abstract void update(EntityType entity);
    public abstract void delete(Key entity);
    public abstract List<EntityType> selectAll();
    public abstract EntityType selectById(Key key);
    public abstract List<EntityType> selectSql(String sql, Object... args);
}

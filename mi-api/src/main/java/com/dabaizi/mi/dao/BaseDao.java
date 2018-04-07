package com.dabaizi.mi.dao;


public interface BaseDao<T,K> {

    int insert(T entity);

    int delete(K id);
}

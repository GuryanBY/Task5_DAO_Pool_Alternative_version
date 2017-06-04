package com.epam.allegro.dao;

import java.util.List;

import com.epam.allegro.bean.BaseBean;

public interface BaseDAO<T extends BaseBean> {
	
	List<T> getAll();
	T getById(int id);
	void add(T item);
	void delete(T item);
	void update(T item);
	
	

}

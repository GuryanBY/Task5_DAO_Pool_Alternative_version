package com.epam.allegro.dao;

import java.util.List;

import com.epam.allegro.bean.Good;

public interface GoodDAO extends BaseDAO<Good> {
	
	List<Good> getGoodsByCategory();

}

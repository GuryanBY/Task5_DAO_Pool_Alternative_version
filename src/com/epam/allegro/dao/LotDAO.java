package com.epam.allegro.dao;

import java.util.List;

import com.epam.allegro.bean.Lot;

public interface LotDAO extends BaseDAO<Lot>{
	
	List<Lot> getLotsInLimit(int min, int max);

}

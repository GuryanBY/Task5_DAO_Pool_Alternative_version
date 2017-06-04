package com.epam.allegro.dao;

import com.epam.allegro.bean.User;

public interface UserDAO extends BaseDAO<User>{
	
	User getUserByLogin(String Login);

}

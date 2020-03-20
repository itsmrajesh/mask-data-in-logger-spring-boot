package com.masklog.masklogger.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.masklog.masklogger.domain.User;

@Component
public class DaoImpl implements Dao {

	List<User> list = new ArrayList<>();

	@Override
	public User addUser(User user) {
		list.add(user);
		return user;
	}

}

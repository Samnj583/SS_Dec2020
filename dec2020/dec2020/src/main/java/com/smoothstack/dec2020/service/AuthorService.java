package com.smoothstack.dec2020.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smoothstack.dec2020.dao.AuthorDao;
import com.smoothstack.dec2020.model.Author;

@Component
public class AuthorService {

	@Autowired
	AuthorDao authorDao;
	public Author getAuthorById(int id) {
		return authorDao.getAuthorById(id);
	}
}

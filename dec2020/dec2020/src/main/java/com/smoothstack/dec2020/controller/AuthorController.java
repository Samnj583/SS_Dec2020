package com.smoothstack.dec2020.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.dec2020.model.Author;
import com.smoothstack.dec2020.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	@RequestMapping(path = "authors/{authorId}", method = RequestMethod.GET)
	public Author getAuthorById(@PathVariable int authorId) {
		return authorService.getAuthorById(authorId);
	}
	
}

package com.bse.content.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bse.content.model.SimpleContent;
import com.bse.content.repository.SimpleContentRepository;

@Service
public class ContentService {

	@Autowired
	protected SimpleContentRepository repo;
	
	public List<SimpleContent> findByTitle(String title) {
		return repo.findByTitle(title);
	}
	
	public SimpleContent save(SimpleContent content) {
		return repo.save(content);
	}
}

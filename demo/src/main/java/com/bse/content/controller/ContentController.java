package com.bse.content.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bse.content.model.SimpleContent;
import com.bse.content.service.ContentService;



@RestController
public class ContentController {

	@Autowired
	private ContentService contentService; 
	
	@RequestMapping("/")
	public String getContent() {
		return "Simple Content";
	}
	
	@PostMapping(path="title", consumes="application/json", produces="application/json") 
	public SimpleContent postType1(@RequestBody SimpleContent content) {
		System.out.println(content.getContent());
		SimpleContent savedContent = contentService.save(content);
		return savedContent;
	}
	
	@GetMapping(path="title", produces="application/json")
	public List<SimpleContent> getMethodName(@RequestParam String title) {
		List<SimpleContent> contentList = contentService.findByTitle(title);
		return contentList;
	}
	
}

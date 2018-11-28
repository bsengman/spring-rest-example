package com.bse.content.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bse.content.model.SimpleContent;

public interface SimpleContentRepository extends CrudRepository<SimpleContent, Long> {

	Optional<SimpleContent> findById(Long id);
	List<SimpleContent> findByTitle(String title);
}

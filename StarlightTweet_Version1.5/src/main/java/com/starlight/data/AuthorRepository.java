package com.starlight.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long>{
	List<Author> findByName(String name);
	List<Author> findByNameLike(String name);
}

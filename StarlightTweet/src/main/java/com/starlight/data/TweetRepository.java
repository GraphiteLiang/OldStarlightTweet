package com.starlight.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long>{

	List<Tweet> findByAuthorid(Long authorid);
}

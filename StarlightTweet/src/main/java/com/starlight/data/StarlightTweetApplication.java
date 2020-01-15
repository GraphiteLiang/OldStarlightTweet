package com.starlight.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@ComponentScan("com.starlight.data")
@RestController
public class StarlightTweetApplication {
	@Autowired
	TweetRepository tweetrepository;
	
	@Autowired
	AuthorRepository authorrepository;
	
	@RequestMapping("/q1")
	public List<Tweet> q1(Long authorid){
		List<Tweet> tweets = tweetrepository.findByAuthorid(authorid);
		return tweets;
	}
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	@RequestMapping("/index")
	public ModelAndView index(Model model) {
		List<Tweet> tweets = tweetrepository.findAll();
		model.addAttribute("tweets", tweets);
		return new ModelAndView("index");
	}
	public static void main(String[] args) {
		SpringApplication.run(StarlightTweetApplication.class, args);
	}

}

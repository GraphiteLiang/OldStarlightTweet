package com.starlight.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@ComponentScan("com.starlight.data")
@RestController
public class StarlightController {
	@Autowired
	TweetRepository tweetrepository;
	
	@Autowired
	AuthorRepository authorrepository;
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	@RequestMapping("/withauthor")
	public ModelAndView withauthor(Long authorid, Model model){
		List<Tweet> tweets = tweetrepository.findByAuthorid(authorid);
		model.addAttribute("tweets", tweets);
		return new ModelAndView("withauthor");
	}
	
	@RequestMapping("/index")
	public ModelAndView index(Model model) {
		List<Tweet> tweets = tweetrepository.findAll();
		model.addAttribute("tweets", tweets);
		return new ModelAndView("index");
	}
}

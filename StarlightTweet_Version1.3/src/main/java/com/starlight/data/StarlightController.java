package com.starlight.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ModelAndView withauthor(String name, Model model){
		List<Tweet> tweets = tweetrepository.findByAuthorname(name);
		model.addAttribute("tweets", tweets);
		return new ModelAndView("withauthor");
	}
	
	@RequestMapping("/index")
	public ModelAndView index(Model model) {
		List<Tweet> tweets = tweetrepository.findAll();
		model.addAttribute("tweets", tweets);
		return new ModelAndView("index");
	}
	@PostMapping("/index")
	public ModelAndView search(Model model, @RequestParam("id") Long id) {
		Optional<Tweet> tweet = tweetrepository.findById(id);
		Tweet result = tweet.get();
		model.addAttribute("tweet",result);
		return new ModelAndView("searchresult");
	}
}

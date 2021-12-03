package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hi")
public class HomeController {
	@RequestMapping("")
	public String hello() {
		return "Hello Human, Welcome to my second java site";
	}
	@RequestMapping("/")
    public String index(@RequestParam(value="name") String searchQuery, @RequestParam(value="last") String searcchQuery )  {
        return "Hello " + searchQuery + " " + searcchQuery;
    }

}

package de.metacoder.experiments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/person/{surename}/{forename}")
	@ResponseBody
	public Person hello(@PathVariable String surename, @PathVariable String forename){
		return new Person(forename, surename);
	}
}

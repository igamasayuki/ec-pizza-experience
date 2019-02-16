package jp.co.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myname")
public class MyNameController {
	@RequestMapping("/index")
	public String index(Model model) {

		

		

		
		return "myName";
	}
}


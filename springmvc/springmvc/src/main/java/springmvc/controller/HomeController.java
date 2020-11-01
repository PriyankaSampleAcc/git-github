package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String homePage() {
		System.out.println("This is home page");
		return "index";
	}

	@RequestMapping("/about")
	public String aboutPage() {
		System.out.println("This is about page");
		return "about";
	}

	@RequestMapping("/service")
	public String servicePage() {
		System.out.println("On Service Page");
		return "service";
	}

	@RequestMapping("/help")
	public String helpPage() {
		System.out.println("On Help Page");
		return "help";
	}
}

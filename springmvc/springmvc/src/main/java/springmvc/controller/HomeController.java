package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView helpPage() {
		System.out.println("On Help Page");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Priyankaa");
		LocalDateTime time = LocalDateTime.now();
		modelAndView.addObject("time", time);
		List<Integer> list = new ArrayList<Integer>();
		list.add(124);
		list.add(124);
		list.add(124);
		list.add(124);
		modelAndView.addObject("marks",list);
		return modelAndView;
	}
}

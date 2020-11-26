package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		return "success";
	}
}

// @RequestMapping(path = "/processform", method = RequestMethod.POST)
// public String handleForm(@RequestParam("useremail") String userEmail,
// @RequestParam("username") String userName,
// @RequestParam("password") String userPassword, Model model) {
// System.out.println("Email " + userEmail);
// System.out.println("Username " + userName);
// System.out.println("passwrod " + userPassword);
//
// // model.addAttribute("name", userName);
// // model.addAttribute("email", userEmail);
// // model.addAttribute("password", userPassword);
//
// User user = new User();
// user.setEmail(userEmail);
// user.setUserName(userName);
// user.setPassword(userPassword);
// model.addAttribute(user);
// return "success";
// }
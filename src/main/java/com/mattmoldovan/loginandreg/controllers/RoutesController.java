package com.mattmoldovan.loginandreg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mattmoldovan.loginandreg.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class RoutesController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session) {
		
		if(session.getAttribute("userId")== null) {
			return "redirect:/";
		}
		return "dashboard.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}

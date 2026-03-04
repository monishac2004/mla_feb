package com.test.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableMethodSecurity
public class UserController {

    private final UserDetailsService userDetailsService;

    UserController(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
	
	@GetMapping("/")
	public String homePage()
	{
		return "index";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return  "login";
	}

	@GetMapping("/user/read")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
	public String userPage()
	{
		return "THIS IS SIMPLE USER URL LINK";
	}
	
	@GetMapping("/delete")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String adminPage()
	{
		return "ONLY ADMIN CAN DELETE THE DATA";
	}
	
	@GetMapping("/update")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String updateUsers()
	{
		return "Details updated with admin role";
		
	}
	
	@GetMapping("/user/hr/onboard")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_HR','ROLE_EMPLOYEE')")
	public String updateHR()
	{
		return "Details updated with HR role";
		
	}
}

package com.vedatakses.security.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.vedatakses.security.util.UserDto;

/**
 * The Class RegistrationController.
 */
@Controller
public class RegistrationController {

	/**
	 * Show registration form.
	 *
	 * @param request the request
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = "/user/registration", method = RequestMethod.GET)
	public String showRegistrationForm(WebRequest request, Model model) {
		UserDto userDto = new UserDto();
		model.addAttribute("user", userDto);
		return "registration";
	}
}

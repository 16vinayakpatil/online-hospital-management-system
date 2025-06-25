package com.mitroimariana.hospital.ctl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.jboss.logging.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mitroimariana.hospital.dto.UserDTO;
import com.mitroimariana.hospital.exception.DuplicateRecordException;
import com.mitroimariana.hospital.form.ChangePasswordForm;
import com.mitroimariana.hospital.form.MyProfileForm;
import com.mitroimariana.hospital.service.RoleServiceInt;
import com.mitroimariana.hospital.service.UserServiceInt;
import com.mitroimariana.hospital.util.DataUtility;

import javassist.compiler.ast.NewExpr;


/** UserCtl Implementation 
 * @author Navigable Set
 * @Version 1.0
 */

@Controller

@RequestMapping(value = "/ctl/User")
public class UserCtl extends BaseCtl {

	@Autowired
	UserServiceInt userservice;

	@Autowired
	RoleServiceInt roleservice;

	@Autowired
	MessageSource messageSource;

	@ModelAttribute
	public void preload(Model model) {
		Map<String, String> genderMap = new LinkedHashMap<String, String>();
		genderMap.put("Female", "Female");
		genderMap.put("Male", "Male");
		
		model.addAttribute("genderMap", genderMap);
		model.addAttribute("roleList", roleservice.search(null));
	
	}

	

	

	/**
	 * Displays User List
	 * 
	 * @param form
	 * @param model
	 * @return
	 */

	

	/**
	 * Displays MyProfile View
	 * 
	 * @param session
	 * @param form
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/profile", method = RequestMethod.GET)

	public String displayProfile(HttpSession session, @ModelAttribute("form") MyProfileForm form, Model model) {
		UserDTO dto = (UserDTO) session.getAttribute("userLogin");
		form.populate(dto);

		System.out.println("/Myprofile");
		return "Myprofile";
	}

	/**
	 * Submits MyProfile
	 * 
	 * @param session
	 * @param form
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public String submitProfile(Locale locale, HttpSession session, @ModelAttribute("form") @Valid MyProfileForm form,BindingResult bindingResult,
			@RequestParam(required = false) String operation,  Model model) {


		if (OP_RESET.equalsIgnoreCase(operation)) {
			return "redirect:/ctl/User/profile";
		}

		if (bindingResult.hasErrors()) {
			return "Myprofile";
		}
		UserDTO dto = (UserDTO) session.getAttribute("userLogin");
		dto = userservice.findByPK(dto.getId());
		dto.setFirstName(form.getFirstName());
		dto.setLastName(form.getLastName());
		dto.setDob(DataUtility.getDate(form.getDob()));
		dto.setPhoneNo(form.getPhoneNo());
		dto.setGender(form.getGender());

		try {
			userservice.update(dto);
		} catch (DuplicateRecordException e) {

		}
		String msg = messageSource.getMessage("message.success.profile", null, locale);
		model.addAttribute("success", msg);

		return "Myprofile";
	}

	/**
	 * Displays Change Password view.
	 * 
	 * @param form
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/changepassword", method = RequestMethod.GET)
	public String displayChangePassword(@ModelAttribute("form") ChangePasswordForm form, Model model) {
		return "ChangePassword";
	}

	/**
	 * Submits Change Password data.
	 * 
	 * @param session
	 * @param form
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/changepassword", method = RequestMethod.POST)
	public String submitChangePassword(Locale locale, HttpSession session,
			@ModelAttribute("form") @Valid ChangePasswordForm form, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "ChangePassword";
		}

		UserDTO dto = (UserDTO) session.getAttribute("userLogin");
		dto = userservice.findByPK(dto.getId());

		// Old password must be valid
		if (dto.getPassword().equals(form.getOldPassword())) {
			// Change Password
			dto.setPassword(form.getNewPassword());

			try {
				userservice.update(dto);
			} catch (DuplicateRecordException e) {
			}

			String msg = messageSource.getMessage("message.success.changePassword", null, locale);
			model.addAttribute("success", msg);
		} else {
			String msg = messageSource.getMessage("message.unsuccess.changePassword", null, locale);
			model.addAttribute("error", msg);
		}

		return "ChangePassword";
	}
}

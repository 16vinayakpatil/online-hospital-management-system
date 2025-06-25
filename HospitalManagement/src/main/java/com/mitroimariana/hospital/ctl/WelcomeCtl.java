package com.mitroimariana.hospital.ctl;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/** WelcomeCtl Implementation
 * 
 * @author Navigable Set
 * @Version 1.0
 */

@Controller
@RequestMapping(value = "/Welcome")
public class WelcomeCtl {
	
	@RequestMapping(method = RequestMethod.GET)
    public String display() {
        return "Welcome";
    }
	
	
	

}

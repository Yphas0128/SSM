package com.yp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *    @author  羊皮卷Y
 *    @Date 2020年7月10日    
 *
 */

@Controller
public class UserController {
	
	@RequestMapping(value ="/user/test")
	public String test(){
		return null;
		
	}
	
	

}

package com.AshokeIT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/letsStrat")
	public String getMsg() 
	{
		String msg="Welcome to maroof Secured Web Portal";
		return msg;
		
		// http://localhost:8080/letsStrat 
//		use above to access the endpoint
	}
}
	
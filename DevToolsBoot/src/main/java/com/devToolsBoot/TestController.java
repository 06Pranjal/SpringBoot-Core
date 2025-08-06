package com.devToolsBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a=67;
		int b=89;
		int c=1;
		return "this is just testing /t Sum of a, b and c is "+(a+b+c);
	}
}

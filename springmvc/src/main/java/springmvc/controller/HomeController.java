package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model) {
    	model.addAttribute("name","Pranjal Singh");
    	System.out.println("this is home controller");

        return "index"; // Will map to /WEB-INF/views/index.jsp
    }


@RequestMapping("/about")
public String about() {
	System.out.println("This is about Controller");
	return "about";

}
}


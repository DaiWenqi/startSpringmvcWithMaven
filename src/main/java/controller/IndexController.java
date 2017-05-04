package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class IndexController {
	@RequestMapping("/index")
	public String list(HttpServletRequest request) {
		return "index";
	}
}

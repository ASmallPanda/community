package life.community.min23.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @AUTHOR : Min
 * @DATE : 2019/11/3
 */

@Controller
public class IndexController {
	@GetMapping("/")
	public String index(){
		return "index";
	}
}

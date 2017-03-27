package cn.limbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by limbo on 2017/3/27.
 */
@Controller
public class TestController {

	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}

}

package com.ms.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("docker")
	public String docker()
	{
		return "this is from spring boot docker";
	}
	
}

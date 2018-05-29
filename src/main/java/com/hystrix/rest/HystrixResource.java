package com.hystrix.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hystrix.service.HystrixService;

@RestController
@RequestMapping("/")
public class HystrixResource {

	@Autowired
	private HystrixService hystrixService;

	@RequestMapping(value = "/hystrix", method = RequestMethod.GET, produces = "application/json")
	public String getTestHystrixInSystem() {
		return hystrixService.testHystrix();
	}

}

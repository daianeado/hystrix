package com.hystrix.service.impl;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.hystrix.service.HystrixService;

@Component
public class HystrixServiceImpl implements HystrixService{

	@Override
	public String testHystrix() {
		return "Acessou microserviço em: " + LocalDate.now();
	}

}

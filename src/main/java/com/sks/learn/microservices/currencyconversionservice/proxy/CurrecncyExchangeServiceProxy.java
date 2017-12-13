package com.sks.learn.microservices.currencyconversionservice.proxy;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sks.learn.microservices.currencyconversionservice.model.ConversionValue;

@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
public interface CurrecncyExchangeServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ConversionValue exchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);

}

package com.sks.learn.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sks.learn.microservices.currencyconversionservice.model.ConversionValue;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionValue currencyConverter(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("fromCurrency", from);
		uriVariables.put("toCurrency", to);

		ResponseEntity<ConversionValue> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/USD/to/INR", ConversionValue.class, uriVariables);
		ConversionValue cv = responseEntity.getBody();
		return new ConversionValue(cv.getId(), from, to, cv.getConversionMultiple(), quantity, quantity.multiply( cv.getConversionMultiple()), cv.getPort());
	}

}

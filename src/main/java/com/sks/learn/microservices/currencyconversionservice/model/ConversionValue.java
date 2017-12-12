package com.sks.learn.microservices.currencyconversionservice.model;

import java.math.BigDecimal;

public class ConversionValue {

	private Long id;
	private String fromCurrency;
	private String toCurrency;
	private BigDecimal conversionMultiple;
	private BigDecimal amount;
	private BigDecimal convertedAmount;
	private int port;

	public ConversionValue(Long id, String fromCurrency, String toCurrency, BigDecimal conversionMultiple,
			BigDecimal amount, BigDecimal convertedAmount, int port) {
		super();
		this.id = id;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.conversionMultiple = conversionMultiple;
		this.amount = amount;
		this.convertedAmount = convertedAmount;
		this.port = port;
	}

	public ConversionValue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getConvertedAmount() {
		return convertedAmount;
	}

	public void setConvertedAmount(BigDecimal convertedAmount) {
		this.convertedAmount = convertedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}

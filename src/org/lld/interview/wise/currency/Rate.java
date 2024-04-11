package org.lld.interview.wise.currency;

import java.math.BigDecimal;

public class Rate {

	BigDecimal amount;
	Currency fromCurrency;
	Currency toCurrency;

	public Rate(BigDecimal amount, Currency fromCurrency, Currency toCurrency) {
		super();
		this.amount = amount;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Currency getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(Currency fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public Currency getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(Currency toCurrency) {
		this.toCurrency = toCurrency;
	}

}

package org.lld.interview.wise.currency;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Objects;

public class CurrencyConvertor {

	RateService rateService;
	
	HashMap<String, Rate> cache ;

	public CurrencyConvertor(RateServiceImpl rateServiceImpl) {
		this.rateService = rateServiceImpl;
		cache= new HashMap< >();
	}

	public static void main(String[] args) {

		CurrencyConvertor currencyConevertor = new CurrencyConvertor(new RateServiceImpl());
		// currencyConevertor.getConversion(null, Currency.US, Currency.RS);
		// currencyConevertor.getConversion(new BigDecimal(100), null, Currency.RS);
	System.out.println("GB to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.GB, Currency.IR));
	System.out.println("IR to GB " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.GB));
	System.out.println("GB to US " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.GB, Currency.US));
	System.out.println("US to GB " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.US, Currency.GB));
	System.out.println(	"US to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.US, Currency.IR));
	System.out.println(	"IR to US " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.US));
	System.out.println(	"IR to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.IR));
	
	System.out.println("GB to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.GB, Currency.IR));
	System.out.println("IR to IR " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.GB));
	System.out.println("GB to US " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.GB, Currency.US));
	System.out.println("US to GB " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.US, Currency.GB));
	System.out.println(	"US to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.US, Currency.IR));
	System.out.println(	"IR to US " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.US));
	System.out.println(	"IR to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.IR));
	
	System.out.println("GB to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.GB, Currency.IR));
	System.out.println("IR to IR " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.GB));
	System.out.println("GB to US " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.GB, Currency.US));
	System.out.println("US to GB " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.US, Currency.GB));
	System.out.println(	"US to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.US, Currency.IR));
	System.out.println(	"IR to US " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.GB));
	System.out.println(	"IR to US " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.US));
	System.out.println("GB to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.GB, Currency.IR));
	System.out.println("IR to IR " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.GB));
	System.out.println("GB to US " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.GB, Currency.US));
	System.out.println("US to GB " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.US, Currency.GB));
	System.out.println(	"US to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.US, Currency.IR));
	System.out.println(	"IR to US " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.GB));
	System.out.println(	"IR to US " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.IR));
	System.out.println("GB to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.GB, Currency.IR));
	System.out.println("IR to IR " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.GB));
	System.out.println("GB to US " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.GB, Currency.US));
	System.out.println("US to GB " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.US, Currency.GB));
	System.out.println(	"US to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.US, Currency.IR));
	System.out.println(	"IR to US " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.GB));
	System.out.println(	"IR to US " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.IR));
	System.out.println("GB to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.GB, Currency.IR));
	System.out.println("IR to IR " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.GB));
	System.out.println("GB to US " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.GB, Currency.US));
	System.out.println("US to GB " +		currencyConevertor.getConversion(new BigDecimal(100), Currency.US, Currency.GB));
	System.out.println(	"US to IR " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.US, Currency.IR));
	System.out.println(	"IR to US " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.GB));
	System.out.println(	"IR to US " +	currencyConevertor.getConversion(new BigDecimal(100), Currency.IR, Currency.IR));

		// BigDecimal amountInRs = currencyConevertor.getConversion(new BigDecimal(100),
		// Currency.US, Currency.RS);
		// System.out.println(amountInRs);

	}

	public BigDecimal getConversion(BigDecimal amount, Currency from, Currency to) {
		
	
		if (from == null || to == null ||amount == null) {
			throw new IllegalArgumentException("Please provide the currencies for conversion or amount");
		}
		if(from.equals(to))
		{
			System.out.println("From and to are same");
			return BigDecimal.ONE;
		}
		
		String key = from.name()+"_"+to.name();
		Rate  currentRate =cache.get(key);
		if(Objects.isNull(currentRate))
		{
		currentRate = rateService.getRate(from, to);
		cache.put(key, currentRate);
		}
		
		if (Objects.nonNull(currentRate) && Objects.nonNull(currentRate.getAmount())) {
			return amount.multiply(currentRate.getAmount());
		}

		return null;
	}

}

package org.lld.interview.wise.currency;

import java.math.BigDecimal;
import java.util.HashMap;

public class RateServiceImpl implements RateService {

	HashMap<String, Rate> rateChace = new HashMap<>();
	int count;

	public RateServiceImpl() {
		rateChace.put("US_GB", new Rate(new BigDecimal(0.80), Currency.US, Currency.GB));
		rateChace.put("GB_US", new Rate(new BigDecimal(1.26), Currency.GB, Currency.GB));
		rateChace.put("US_IR", new Rate(new BigDecimal(83.32), Currency.US, Currency.IR));
		rateChace.put("IR_US", new Rate(new BigDecimal(0.012), Currency.IR, Currency.US));
		rateChace.put("GB_IR", new Rate(new BigDecimal(104.76), Currency.GB, Currency.IR));
		rateChace.put("IR_GB", new Rate(new BigDecimal(0.0096), Currency.IR, Currency.GB));
		count=0;
	}

	@Override
	public Rate getRate(Currency from, Currency to) {
		count++;
		System.out.println("Rate Service is hit" +count);

		StringBuilder key = new StringBuilder().append(from).append("_").append(to);
		return rateChace.get(key.toString());
	}

}

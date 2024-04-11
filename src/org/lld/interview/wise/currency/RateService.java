package org.lld.interview.wise.currency;

import java.math.BigDecimal;
import java.util.HashMap;

public interface RateService {
	
	HashMap<String,BigDecimal> hm = new HashMap<String, BigDecimal>();
	
	
	
	
	public Rate getRate(Currency from, Currency To);

}

package CurrencyConverter;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getShortName() {
		return this.shortName;
	}
	
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	
	public void defaultValues() {
		String currency = this.name;
		
		switch (currency) {	
			case "US Dollar":
				this.exchangeValues.put("USD", 1.00);
				this.exchangeValues.put("EUR", 0.94);
				this.exchangeValues.put("RUPEES", 88.82);
				break;
			case "Euro":
				this.exchangeValues.put("USD", 1.06);
				this.exchangeValues.put("EUR", 1.00);
				this.exchangeValues.put("RUPEES", 88.11);
				break;
			case "Indian Rupees":
				this.exchangeValues.put("USD",0.012);
				this.exchangeValues.put("EUR", 0.011);
				this.exchangeValues.put("RUPEES", 1.00);
				break;
			
		}
	}
	
	public static ArrayList<Currency> init() {
		ArrayList<Currency> currencies = new ArrayList<Currency>();
				
		currencies.add( new Currency("US Dollar", "USD") );
		currencies.add( new Currency("Euro", "EUR") );
		currencies.add( new Currency("Indian Rupees", "RUPEES") );
		
		
		
		for (Integer i =0; i < currencies.size(); i++) {
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	public static Double convert(Double amount, Double exchangeValue) {
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}
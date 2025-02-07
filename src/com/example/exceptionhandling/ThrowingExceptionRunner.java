package com.example.exceptionhandling;

class Amount {
	private String currency;
	
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return 	amount + " " + currency;
	}
	
	public void add(Amount that) throws CurrenciesDoNotMatchException {
		if(!this.currency.equals(that.currency)) {
			//throw new Exception("Currencies "+this.currency+" & "+that.currency+" dont match");
			throw new CurrenciesDoNotMatchException("Currencies "+this.currency+" & "+that.currency+" dont match");
		}
		
		this.amount = this.amount + that.amount;
	}
	
}

class CurrenciesDoNotMatchException extends Exception{
	
	 
	CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amount amt1 = new Amount("USD",10);
		Amount amt2 = new Amount("EUR",20);
		try {
			amt1.add(amt2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(amt1);
	}
}

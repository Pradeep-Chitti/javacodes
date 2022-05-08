package com.chitti.AbstractAtm;

public class BankFactory {
public Atm getBank(String type) {
	if(type.equalsIgnoreCase("UnionBank")) {
		return new UnionBankImpl();
		
	}
	else if (type.equalsIgnoreCase("HdfcBank")) {
		
		return (Atm) new HdfcBankImpl();
	}
	else if (type.equalsIgnoreCase("LaxmiBank")) {
		
		return new LaxmiBankImpl();
	}
	else {
		System.out.println("not available");
	}
	return null;
	}
}


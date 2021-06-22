package GameStore.entities.concrete;

import GameStore.entities.Abstract.Entity;
import GameStore.entities.Abstract.Member;

public class Store extends Member implements Entity{
	
	private String firmName;
	private String taxNumber;
	private String adress;
	
	public Store() {
		
	}
	public Store(String firmName, String taxNumber, String adress) {
		super();
		this.firmName = firmName;
		this.taxNumber = taxNumber;
		this.adress = adress;
	}

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}

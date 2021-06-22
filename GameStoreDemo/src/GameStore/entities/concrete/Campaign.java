package GameStore.entities.concrete;

import GameStore.entities.Abstract.Entity;

public class Campaign implements Entity {
	
	private int campaignId;
	private String campaignName;
	private int discountRatio;
	public Campaign() {
		
	}
	public Campaign(int campaignId, String campaignName, int discountRatio) {
		
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discountRatio = discountRatio;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getDiscountRatio() {
		return discountRatio;
	}
	public void setDiscountRatio(int discountRatio) {
		this.discountRatio = discountRatio;
	}
	
	

}

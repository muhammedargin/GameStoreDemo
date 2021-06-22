package GameStore.business.concrete;

import GameStore.business.Abstract.CampaignService;
import GameStore.entities.concrete.Campaign;

public class CampaignManager implements CampaignService{
	
	public CampaignManager() {
		
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi");
		
	}

}

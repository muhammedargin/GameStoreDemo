package GameStore.business;

import GameStore.entities.concrete.Campaign;
import GameStore.entities.concrete.Game;
import GameStore.entities.concrete.Player;

public  class Utils {

	//buras� bir discount manager alacak ve i�eride manager.hesapla kullan�lacak
	public static int discountCalculator(Game game,Campaign campaign) {
		
		int newPrice=(game.getPrice()-((game.getPrice()*campaign.getDiscountRatio())) / 100);
		
		System.out.println(game.getGameName()+" oyununun fiyat� "+ campaign.getCampaignName() + "Kampanyas� ile" 
				+ newPrice + "fiyat�na indirildi.");
		return  newPrice;
		
	}
}

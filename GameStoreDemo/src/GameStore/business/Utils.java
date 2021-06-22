package GameStore.business;

import GameStore.entities.concrete.Campaign;
import GameStore.entities.concrete.Game;
import GameStore.entities.concrete.Player;

public  class Utils {

	//burasý bir discount manager alacak ve içeride manager.hesapla kullanýlacak
	public static int discountCalculator(Game game,Campaign campaign) {
		
		int newPrice=(game.getPrice()-((game.getPrice()*campaign.getDiscountRatio())) / 100);
		
		System.out.println(game.getGameName()+" oyununun fiyatý "+ campaign.getCampaignName() + "Kampanyasý ile" 
				+ newPrice + "fiyatýna indirildi.");
		return  newPrice;
		
	}
}

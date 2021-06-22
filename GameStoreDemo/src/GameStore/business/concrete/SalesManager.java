package GameStore.business.concrete;

import GameStore.business.Utils;
import GameStore.business.Abstract.SalesService;
import GameStore.entities.concrete.Campaign;
import GameStore.entities.concrete.Game;
import GameStore.entities.concrete.Player;
import GameStore.entities.concrete.Store;

public class SalesManager implements SalesService {

	@Override
	public void sale(Player player, Game game, Campaign campaign, Store store) {
		System.out.println(player.getFirstName()+"oyuncusu "+store.getFirmName()+ "d�kkan�ndan"+ game.getGameName()+ "oyununu"
				+ Utils.discountCalculator(game, campaign) + "fiyat�ndan sat�n ald�.");
		
	}

}

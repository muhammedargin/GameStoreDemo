package GameStore.business.Abstract;

import GameStore.entities.concrete.Campaign;
import GameStore.entities.concrete.Game;
import GameStore.entities.concrete.Player;
import GameStore.entities.concrete.Store;

public interface SalesService {
	
	public void sale(Player player,Game game,Campaign campaign,Store store);

}

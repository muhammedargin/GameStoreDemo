package GameStore.business.Abstract;

import GameStore.entities.Abstract.Entity;
import GameStore.entities.concrete.Player;

public interface PlayerService {
	
	public  void add(Player player);
	
	public  void delete(Player player);;
	public  void update(Player player);
	
	
	
}

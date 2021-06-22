package GameStore.business.Abstract;

import GameStore.entities.concrete.Game;
import GameStore.entities.concrete.Player;

public interface GameService {
	
	public  void add(Game game);
	
	public  void delete(Game game);
	public  void update(Game game);

}

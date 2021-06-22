package GameStore.business.concrete;
import GameStore.business.Abstract.GameService;
import GameStore.entities.concrete.Game;

public class GameManager implements   GameService {
	
	Game game;
	
	
	public GameManager(Game game) {
	this.game = game;
	
}

	@Override
	public void add(Game game) {
		
		System.out.println("Oyun eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi");
		
	}
	



}

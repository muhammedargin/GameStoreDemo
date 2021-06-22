package GameStore.business.concrete;
import GameStore.business.Abstract.*;
import GameStore.entities.concrete.Player;

public class PlayerManager implements  PlayerService{
	Player player;
	MemberCheckService memberCheckService;
	
	public PlayerManager(Player player,MemberCheckService memberCheckService) {
		this.player = player;
		this.memberCheckService=memberCheckService;
	}
	@Override
	public void add(Player player) {
			
		if (memberCheckService.validate(player)==true) {
			
			System.out.println("Yeni oyuncu eklendi: "+player.getFirstName());
			
		}
		else {
			System.out.println("Kiþi doðrulamasý baþarýsýz");
		}
		
	}
	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu silindi");
		
	}
	@Override
	public void update(Player player) {
		System.out.println("Oyuncu güncellendi");
		
	}
	
	

	

}

package GameStore.UI;

import GameStore.business.Utils;
import GameStore.business.concrete.CampaignManager;
import GameStore.business.concrete.MernisServiceAdapter;
import GameStore.business.concrete.PlayerManager;
import GameStore.business.concrete.SalesManager;
import GameStore.business.concrete.StoreManager;
import GameStore.entities.Abstract.Entity;
import GameStore.entities.concrete.Campaign;
import GameStore.entities.concrete.Game;
import GameStore.entities.concrete.Player;
import GameStore.entities.concrete.Store;

public class Main {

	public static void main(String[] args) {
		Store store1 = new Store ("Bethesda Games","123456789","Rockville, Maryland, ABD");
		StoreManager storeManager = new StoreManager();
		storeManager.add(store1);
		Player player1 = new Player("Engin","Demiroð",1985,"28861499108");
		PlayerManager playerManager = new PlayerManager(player1, new MernisServiceAdapter());
		playerManager.add(player1);
		
		Game game = new Game(store1,1,"Elder Scrolls: Skyrim","Bethesda Software",100);
		Campaign campaign = new Campaign(1,"Halloween Week",25);
		CampaignManager campaignManager= new CampaignManager();
		campaignManager.add(campaign);
		
		SalesManager salesManager = new SalesManager();
		
		salesManager.sale(player1, game, campaign, store1);
		
		
		
		
		
	}

}

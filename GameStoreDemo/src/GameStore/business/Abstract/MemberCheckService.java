package GameStore.business.Abstract;

import GameStore.entities.Abstract.Member;
import GameStore.entities.concrete.Player;

public interface MemberCheckService {
	
	public boolean validate(Player player);

}

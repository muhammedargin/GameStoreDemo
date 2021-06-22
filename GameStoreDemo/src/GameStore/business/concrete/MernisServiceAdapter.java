package GameStore.business.concrete;
import java.rmi.RemoteException;
import java.util.Locale;
import GameStore.business.Abstract.MemberCheckService;
import GameStore.entities.concrete.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements MemberCheckService {

	@Override
	public boolean validate(Player player) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result=true;
		
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName().toUpperCase(new Locale("tr")),
					player.getLastName().toUpperCase(new Locale("tr")), player.getBirthYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}

	
}

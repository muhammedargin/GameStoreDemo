package GameStore.business.concrete;
import GameStore.business.Abstract.StoreService;
import GameStore.entities.Abstract.Entity;
import GameStore.entities.concrete.Store;

public class StoreManager implements StoreService{
     
	
	
	public StoreManager() {
		
		
		
	}
	@Override
	public void add(Store store) {
		System.out.println("D�kkan eklendi");
		
	}
	@Override
	public void delete(Store store) {
		System.out.println("D�kkan silindi");
		
	}
	@Override
	public void update(Store store) {
		System.out.println("D�kkan g�ncellendi");
		
	}
	
	



}

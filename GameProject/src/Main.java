import java.util.Date;

import Adapters.EdevletValidationAdapter;
import Concrete.CampaginManager;
import Concrete.MemberManager;
import Concrete.SaleManager;
import Entities.Campagin;
import Entities.Member;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {
		
		Member member = new Member(1, "darkNight", "1234", "Ahmet", "Çevik", "12341214", new Date(1992, 3, 4));
		Sale sale = new Sale(1, "Oyun Satýþý", 120);
		Campagin campagin = new Campagin(1, "Black Friday!", 20);
	
		MemberManager memberManager = new MemberManager(new EdevletValidationAdapter());
		SaleManager saleManager = new SaleManager();
		CampaginManager campaginManager = new CampaginManager();
		
		
		memberManager.add(member);
	
		campaginManager.add(campagin);
		
		saleManager.saleWithCampagin(campagin, member);
	
	}

}

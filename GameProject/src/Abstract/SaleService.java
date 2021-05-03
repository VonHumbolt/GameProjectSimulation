package Abstract;

import Entities.Campagin;
import Entities.Member;
import Entities.Sale;

public interface SaleService {
	void saleGame(Member  member, Sale sale);
	void saleWithCampagin(Campagin campagin, Member member);
}

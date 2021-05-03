package Concrete;

import Abstract.SaleService;
import Entities.Campagin;
import Entities.Member;
import Entities.Sale;

public class SaleManager implements SaleService{

	@Override
	public void saleGame(Member member, Sale sale) {
		System.out.println(member.getUserName() + " bir oyunu satýþa çýkardý: "+ sale.getPrice());
		
	}

	@Override
	public void saleWithCampagin(Campagin campagin, Member member) {
		System.out.println(campagin.getCampaginName() + " isimli kampanya baþladý. Þimdi "+ 
				member.getUserName() + "'in oyunlarýný %"+campagin.getDiscount() + " indirimli alýn!");
		
	}

}

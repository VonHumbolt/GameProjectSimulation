package Concrete;

import Abstract.MemberService;
import Abstract.UserValidationService;
import Entities.Member;

public class MemberManager implements MemberService {

	UserValidationService validationService;
	
	public MemberManager(UserValidationService validationService) {
		this.validationService = validationService;
	}
	
	@Override
	public void add(Member member) {
		if(this.validationService.isUserReal(member)) {
			System.out.println(member.getUserName()+" isminde bir kullanýcý oluþturuldu!");
		}else {
			System.out.println("Kullanýcýnýn yaþý 18 veya büyük olmalýdýr!");
		}
		
	}

	@Override
	public void delete(Member member) {
		System.out.println(member.getUserName()+ " isimli kullanýcý silindi!");
	}

	@Override
	public void update(Member member) {
		System.out.println("Kullanýcý güncellendi: "+ member.getUserName());
		
	}
	
	
}

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
			System.out.println(member.getUserName()+" isminde bir kullan�c� olu�turuldu!");
		}else {
			System.out.println("Kullan�c�n�n ya�� 18 veya b�y�k olmal�d�r!");
		}
		
	}

	@Override
	public void delete(Member member) {
		System.out.println(member.getUserName()+ " isimli kullan�c� silindi!");
	}

	@Override
	public void update(Member member) {
		System.out.println("Kullan�c� g�ncellendi: "+ member.getUserName());
		
	}
	
	
}

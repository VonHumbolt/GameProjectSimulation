package Adapters;

import java.util.Calendar;

import Abstract.UserValidationService;
import Entities.Member;

public class EdevletValidationAdapter implements UserValidationService{

	@Override
	public boolean isUserReal(Member member) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		if(currentYear - member.getBornDate().getYear() >= 18 ) {
			return true;
		}
		
		return false;
	}

}

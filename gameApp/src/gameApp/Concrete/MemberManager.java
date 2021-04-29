package gameApp.Concrete;

import java.util.Random;

import gameApp.Abstract.BaseMemberManager;
import gameApp.Abstract.MemberCheckService;
import gameApp.Entities.Member;

public class MemberManager extends BaseMemberManager implements MemberCheckService {
	
	MemberCheckService memberCheckService;

	public MemberManager(MemberCheckService memberCheckService) {
		
		this.memberCheckService = memberCheckService;
	}
	
	public void add(Member member) {
if(memberCheckService.CheckIfRealPerson(member)) {
			
			System.out.println("Üye veritabanýna kaydedildi " + member.getFirstName());
		}
		else {
			System.out.println("üye doðrulamadan geçemediði için veritabanýna kaydedilemedi.");
		}
	}

	@Override
	public boolean CheckIfRealPerson(Member member) {
		Random r=new Random();
		int sayi=r.nextInt(3);
		if(sayi==1) {
			return false;
		}
		else {
			return true;
		}
	}

	

}

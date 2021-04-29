package gameApp.Abstract;

import gameApp.Entities.Member;

public abstract class BaseMemberManager implements MemberService{

	public void add(Member member) {
		System.out.println("Üye veri tabanýna eklendi. " + member.getFirstName());
	}
	public void update(Member member) {
		System.out.println("Üye güncellendi " + member.getFirstName());
	}
	public void delete(Member member) {
		System.out.println("Üye silindi " + member.getFirstName());
	}
}
